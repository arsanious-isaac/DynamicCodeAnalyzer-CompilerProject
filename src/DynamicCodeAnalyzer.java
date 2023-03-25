import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.HashMap;

public class DynamicCodeAnalyzer extends JavaParserBaseListener {

    TokenStreamRewriter rewriter;
    int counter = 0;

    public DynamicCodeAnalyzer(CommonTokenStream tokens) {

        rewriter = new TokenStreamRewriter(tokens);
    }



    @Override public void enterBlock(JavaParser.BlockContext ctx) {
        int i = ctx.getStart().getTokenIndex();
        rewriter.insertAfter(i,"//block " + counter);
        if (counter==0){

            int start = ctx.getStart().getTokenIndex();
            rewriter.insertAfter(start,"\n int[] intArray = new int[20]; \n");


            int end = ctx.getStop().getTokenIndex();
            rewriter.insertBefore(end,
                    "\n PrintWriter out = new PrintWriter(\"output2.txt\");\n" +
                    " for(int i=1 ; i< 20; i++){\n" +
                    "     if (intArray[i] == 1)\n" +
                    "        out.println(\"block#\"+ (i-1));\n" +
                    " }\n" +
                    "        out.close();\n");

        }
        counter++;
        rewriter.insertAfter(i, "\n\t\t intArray ["+counter+"] =1;");

    }





}






