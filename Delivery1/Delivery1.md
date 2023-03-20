# Delivery 1 #

- [x] Github repository creation

![Repository QR Code](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/29d7ccda243cebb76c896872c9171a2abd8f4892/Delivery1/repo-qr-code.png)
    
    ---------------------------------------------------

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
  
- [ ] Starting rule of the grammar

- [ ] A Java program based on Antlr that takes a java file as an input and outputs a modified intermediate java file (injected code):
a comment is added in each code block indicating the block number
