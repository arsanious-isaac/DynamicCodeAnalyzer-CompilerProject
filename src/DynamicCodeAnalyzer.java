import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.HashMap;

public class DynamicCodeAnalyzer extends JavaParserBaseListener {

    TokenStreamRewriter rewriter;
    TokenStreamRewriter rewriter2;
    int counter = 0;
    StringBuilder build = new StringBuilder("");

    public DynamicCodeAnalyzer(CommonTokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
        rewriter2 = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        rewriter.insertBefore(ctx.getStart().getTokenIndex(),
                " import java.io.PrintWriter;\n" + "import java.io.FileNotFoundException;\n");
    }

    @Override
    public void enterClassBody(JavaParser.ClassBodyContext ctx) {
        rewriter.insertAfter(ctx.getStart().getTokenIndex(),
                "\nprivate static PrintWriter blocks;\n" +
                    "    private static PrintWriter branches;\n");
    }



     @Override public void enterBlock(JavaParser.BlockContext ctx) {
        int start = ctx.getStart().getTokenIndex();
        rewriter.insertAfter(start,"//block " + (counter+1));
        rewriter2.insertAfter(start,"//block " + (counter+1));


        if (counter==0){
            rewriter.insertAfter(start,
                    "\n  blocks = new PrintWriter(\"textoutput/output1blocks.txt\");\n" +
                    "\n  branches = new PrintWriter(\"textoutput/output1branches.txt\");\n");
            rewriter.insertBefore(start,"throws FileNotFoundException");
            int end = ctx.getStop().getTokenIndex();
            rewriter.insertBefore(end, " blocks.close();\n" + "branches.close();\n");
        }

        counter++;
        rewriter.insertAfter(start, "\n\t\t blocks.println(\"block #" + counter + " is visited\");\n");

    }


@Override
    public void enterForStatement(JavaParser.ForStatementContext ctx) {
        if(ctx.getChild(4).getText().charAt(0) != '{'){
            counter++;
            rewriter.insertBefore(ctx.statement().getStart(),
                    "{//block " + (counter) + "\n\t\t blocks.println(\"block #" + counter + " is visited\");\n");
            rewriter.insertAfter(ctx.statement().getStop(),"}");
            rewriter2.insertBefore(ctx.statement().getStart(), "{//block " + (counter) + "\n\t\t");
            rewriter2.insertAfter(ctx.statement().getStop(),"}");
        }
    }

   @Override
    public void enterIfStatement(JavaParser.IfStatementContext ctx) {

        // check if there is branch then append the build
        char[] character = ctx.parExpression().getText().toCharArray(); // get "(x<3 || y < 5)" into characters array [(, x , < , 3.......]
        build.append("for(int i = 0; i != 1 ;){\n\t\t if (");

        if(ctx.parExpression().getText().contains("|")){
            for (int i = 1; i < character.length-1; i++) {

                if (character[i] == '|') {
                    build.append(") i = 1; \n\t\t if(i==1)branches.println(\"branch of block #" + (counter+1) + " is not covered\"); else if (");
                    i += 1;continue;}

                build.append(character[i]);

                if(i == character.length-2)
                    build.append(") i = 1;\n\t}");
            };
        }
        else build.setLength(0);
        //block comment and brackets
        if(ctx.getChild(2).getText().charAt(0) != '{') {
            counter++;
            rewriter.insertBefore(ctx.statement(0).getStart(),
                    "{//block " + (counter) + "\n\t\t " + build.toString() + "\n\t\t blocks.println(\"block #" + counter + " is visited\");\n");
            rewriter.insertAfter(ctx.statement(0).getStop(), "}");
            rewriter2.insertBefore(ctx.statement(0).getStart(), "{//block " + (counter)+ "\n\t\t");
            rewriter2.insertAfter(ctx.statement(0).getStop(), "}");
        }
        else rewriter.insertAfter(ctx.statement(0).getStart(), "\n\t\t" + build.toString() + "\n\t\t");
        if(ctx.getChild(4).getText().charAt(0) != '{') {
            counter++;
            rewriter.insertBefore(ctx.statement(1).getStart(),
                    "{//block " + (counter) + "\n\t\t  blocks.println(\"block #" + counter + " is visited\");\n");
            rewriter.insertAfter(ctx.statement(1).getStop(), "}");
            rewriter2.insertBefore(ctx.statement(1).getStart(), "{//block " + (counter)+ "\n\t\t");
            rewriter2.insertAfter(ctx.statement(1).getStop(), "}");
        }

        }
    
    

 @Override
    public void enterWhileStatement(JavaParser.WhileStatementContext ctx) {
        // check if there is branch then append the build
        char[] character = ctx.parExpression().getText().toCharArray();
        build.append("for(int i = 0; i != 1 ;){\n\t\t if (");

        if(ctx.parExpression().getText().contains("|")){
            for (int i = 1; i < character.length-1; i++) {

                if (character[i] == '|') {
                    build.append(") i = 1; \n\t\t if(i==1)branches.println(\"branch of block #" + (counter+1) + " is not covered\"); else if (");
                    i += 1;continue;}

                build.append(character[i]);

                if(i == character.length-2)
                    build.append(") i = 1;\n\t}");
            };
        }
        else build.setLength(0);
        /////////////////////////////////////////////
        if(ctx.getChild(2).getText().charAt(0) != '{') {
            counter++;
            rewriter.insertBefore(ctx.statement().getStart(),
                    "{//block " + (counter) + "\n\t\t " + build.toString() + "\n\t\t blocks.println(\"block #" + counter + " is visited\");\n");
            rewriter.insertAfter(ctx.statement().getStop(), "}");
            rewriter2.insertBefore(ctx.statement().getStart(), "{//block " + (counter)+ "\n\t\t");
            rewriter2.insertAfter(ctx.statement().getStop(), "}");
        }
        else rewriter.insertAfter(ctx.statement().getStart(), "\n\t\t" + build.toString() + "\n\t\t");
    }



}



