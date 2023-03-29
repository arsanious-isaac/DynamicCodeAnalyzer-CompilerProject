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


    }





}






