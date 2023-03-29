import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.io.File;  // Import the File class

public class Test {
    public static void main(String[] args) throws IOException {
//      System.out.print("Enter Java file path: ");
//      Scanner sc = new Scanner(System.in);
//      String fileName = sc.nextLine();
//      File file = new File(fileName);
//      FileInputStream fis = null;
//      fis = new FileInputStream(file);
        CharStream input = CharStreams.fromFileName("input.txt");
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        DynamicCodeAnalyzer myListner = new DynamicCodeAnalyzer(tokens);
        walker.walk(myListner, tree); // initiate walk of tree with listener
        FileWriter FW = new FileWriter("output1.java");
        FW.write(myListner.rewriter.getText().replace("input", "output1"));
        FW.close();
    }
}