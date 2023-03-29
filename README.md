# Dynamic Java Code Analyzer -Compiler Course Project-
A dynamic code analyzer for Java Language to generate statement and branches code coverage reports.

#### Team Members
- [Arsanious Isaac Helmy](https://github.com/arsanious-isaac)
- [Clara Raef Nasry](https://github.com/Clara-Raef)
- [Mark Magdy Amin](https://github.com/markmagdy822000)
- [Mina Nagy Latif](https://github.com/MinaNagyLatif)
- [Youssef Nazeer Tawfik](https://github.com/Yousef-nazeer)

### References
- https://stackoverflow.com/questions/14519416/a-difference-between-statement-and-decision-coverage#:~:text=Statement
- https://github.com/antlr/intellij-plugin-v4
- https://github.com/antlr/grammars-v4/tree/master/java/java

<details>
  <summary> ✓ Delivery 1 </summary>
  # Delivery 1 #

- [x] Github repository creation

![Repository QR Code](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/29d7ccda243cebb76c896872c9171a2abd8f4892/Delivery1/repo-qr-code.png)
    

- [x] ANTLR Java Lexer & Parser used
  - Credits to https://github.com/antlr/grammars-v4/tree/master/java/java
    - Java Lexer (https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/JavaLexer.g4)
    - Java Parser (https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/JavaParser.g4)
    ---------------------------------------------------

- [x] Testing the grammar & showing the parse tree using ANTLR with Intelli-J
  - Simple If condition program that states Success/Failure for a certain grade
    ```
       public class IfCond {
        public static void main(String[] args) {
          int grade=72;
          if(grade>50){
              System.out.print("Succeeded");
          }
          else{
              System.out.println("Failed");
          }
      }
    }
    ```
    
   If condition Parse Tree
   
     ![If condition test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-ifcond.png)
     
     ![If condition Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/f636bf47fb7fd3762b5fd72887ca8aa81e6416ad/Delivery1/parseTree%20--Ifcondition.png)
     
     

  - Simple While loop that prints value of variable k of type integer while it's less than or equal to 10 
    ```
    public class WhileLoop {
    public static void main(String[] args) {
        int k=4;
        while(k<=10){
            System.out.println(k);
        }
    }
    }
    ```
  ---------------------------------------------------

   While loop Parse Tree
   
     ![While loop test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-whileloop.png)
      
     ![While loop Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/parseTree--whileloop.png)
  ---------------------------------------------------
    While loop fault Parse Tree
      
     ![While loop fault test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-whileloopfault.png)
     
     ![While loop fault Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/392862f1ec731e4dd1d90bc6c463213d5d79b394/Delivery1/parseTree-whileloopfault.png)
  ---------------------------------------------------
  
    String Operation Parse Tree
      
     ![String Operation test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/Delivery1/Code%2BParseTree-StringOperation.png)
         
     ![String Operation test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/Delivery1/parseTree--StringOperations.png)
     
  
  
- [x] Starting rule of the grammar
      compilationUnit

- [x] A Java program based on Antlr that takes a java file as an input and outputs a modified intermediate java file (injected code):
a comment is added in each code block indicating the block number

  ![output](https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/b5e24ecada407949e1561310abf6004abeefec03/Delivery1/Screen%20Shot%202023-03-29%20at%205.12.49%20PM.png)
  ![input-outputCompare](https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/b5e24ecada407949e1561310abf6004abeefec03/Delivery1/Screen%20Shot%202023-03-29%20at%205.13.48%20PM.png)
</details>

<details>
  <summary> ✓ Delivery 2 </summary>
</details>

<details>
  <summary> Delivery 3 </summary>
</details>
