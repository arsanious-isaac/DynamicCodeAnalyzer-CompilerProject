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
        
          //compile and run java code automatic
        Process theProcess = null;
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        compiler.run(null, null, null, fileObjOutput.getPath());
        try {
            theProcess = Runtime.getRuntime().exec("java javaoutput/" + fileObjOutput.getName());
        } catch (IOException e) {
            System.err.println("Error on exec() method");
            e.printStackTrace();
        }
        Thread.sleep(4000);
        ////////////////////
        
        
        
    }
    static void genHtml(String code) throws IOException {

        String line;
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new StringReader(code));
        Pattern pattern = Pattern.compile("block" + "\\D*(\\d+)");

        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);


            if (line.contains("{")) {
                if(matcher.find()) {        // there is "block i"   in the line
                    String numberString = matcher.group(1);
                    int number = Integer.parseInt(numberString); // get i to the number
                    line = "<div id=\"b" + number + "\"" + ">" + line;  // <div id=b i> block i
                    if(line.contains("|")){
                        line = line.replace("(","(<span id = \"c" + number +"\"" +">");
                        line = line.replace(")","</span>)");
                    };

                } else line = "<div>" + line;
            }
            if (line.contains("}")) {
                line = line + "</div>";
            }

            sb.append(line + System.lineSeparator());


        }
    
    
    
    
    
}
