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
        int start = ctx.getStart().getTokenIndex();
        rewriter.insertAfter(start,"//block " + (counter+1));

        if (counter==0){
            rewriter.insertAfter(start,"\n int[] intArray = new int[20]; \n" + "int c = 0; \n");
            int end = ctx.getStop().getTokenIndex();
            rewriter.insertBefore(end,
                    "\n PrintWriter out = new PrintWriter(\"output2.txt\");\n" +
                    " for(int i=0 ; i < c; i++){\n" +
                    "        out.println(\"block #\"+ intArray[i] + \" is visited\");\n" +
                    " }\n" +
                    "        out.close();\n");
        }
        counter++;
        rewriter.insertAfter(start, "\n\t\t intArray [c++] ="+ counter + ";");

    }

}






