<div align="center">
  <h1>Dynamic Java Code Analyzer</h1>
  <h3>A group project for Compiler Course</h3>
  <p>
  <a href="https://github.com/Louis3797/awesome-readme-template/graphs/contributors">
    <img src="https://img.shields.io/badge/contriburtors-5-green" alt="contributors" />
  </a>
  <a href="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/commits/main">
    <img src="https://img.shields.io/badge/last%20commit-april%202023-blue" alt="last update" />
  </a>
  </p>

</div>

## Team Members
<div align="center">
  <p>
    <a href="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/graphs/contributors">
      <img src="https://contrib.rocks/image?repo=Clara-Raef/DynamicCodeAnalyzer-CompilerProject" />
    </a>
  </p>
</div>

- [Arsanious Isaac Helmy](https://github.com/arsanious-isaac)
- [Clara Raef Nasry](https://github.com/Clara-Raef)
- [Mark Magdy Amin](https://github.com/markmagdy822000)
- [Mina Nagy Latif](https://github.com/MinaNagyLatif)
- [Youssef Nazeer Tawfik](https://github.com/Yousef-nazeer)

## :star2: About the Project
 <p>
  This is a dynamic code analyzer for Java Programming Language to generate statement and branches code coverage reports.
 </p>

**Statement coverage VS. Branch coverage**

```
if(a || b || (c && d && !e)) {
    test1 = true;
} else {
    test2 = false;
}
```
- **Statement Coverage:** when our code says that test1 and test2 are hit.
- **Branch Coverage:** to test the cases when a is true, when a is false but b is true, when a and b are false but c and d are true and e is false, and so on.

_100% branch coverage => 100% statement coverage, while 100% statement coverage does not imply 100% branch coverage_

## System Flow
<div align="center"> 
  <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/57ad60a07941017c39a13010ccb60323dc8317bd/Delivery3/flow.jpeg" />
</div>

## :gear: Built With
- Java
- IntelliJ
- ANTLR plug-in
- CSS & HTML


## :compass: Roadmap
<details>
<summary>✓ Delivery 1</summary>
  
- [x] Github repository creation
  
      <div align="center">
        <p>
        <img src="https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/29d7ccda243cebb76c896872c9171a2abd8f4892/Delivery1/repo-qr-code.png" />
        </p>
      </div>
  ---------------------------------------------------

- [x] ANTLR Java Lexer & Parser used
  - Credits to https://github.com/antlr/grammars-v4/tree/master/java/java
  - Custom labels were added to Java Parser later in Delivery 3
  
  ---------------------------------------------------

- [x] Testing the grammar & showing the parse tree using ANTLR with Intelli-J

  - :test_tube: Simple If condition program that states Success/Failure for a certain grade
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
  - :camera: If condition Parse Tree

   ![If condition test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-ifcond.png)
     
   ![If condition Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/f636bf47fb7fd3762b5fd72887ca8aa81e6416ad/Delivery1/parseTree%20--Ifcondition.png)
  
    ---------------------------------------------------

  - :test_tube: Simple While loop that prints value of variable k of type integer while it's less than or equal to 10 
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
                     
  - :camera:  While loop Parse Tree   
                     
  ![While loop test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-whileloop.png)
      
  ![While loop Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/parseTree--whileloop.png)
  
                     
 - :camera: While loop fault Parse Tree
      
     ![While loop fault test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/4415d9383c010d8b1f468a8279a206429e6343ad/Delivery1/test-whileloopfault.png)
     
     ![While loop fault Parse Tree](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/392862f1ec731e4dd1d90bc6c463213d5d79b394/Delivery1/parseTree-whileloopfault.png)
                     
    ---------------------------------------------------

 - :camera: String Operation Parse Tree
      
     ![String Operation test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/Delivery1/Code%2BParseTree-StringOperation.png)
         
     ![String Operation test](https://github.com/Clara-Raef/Dynamic-Code-Analyzer--Compiler-Course-Project/blob/main/Delivery1/parseTree--StringOperations.png)
                     
    ---------------------------------------------------
                     
- [x] Starting rule of the grammar:
      ****compilationUnit****
                     
    ---------------------------------------------------

- [x] A Java program based on Antlr (USING LISTENER) that takes a java file as an input and outputs a modified intermediate java file (injected code):
a comment is added in each code block indicating the block number
                     
<div align="center">
  <h3> :camera: Output file</h3>
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/b5e24ecada407949e1561310abf6004abeefec03/Delivery1/Screen%20Shot%202023-03-29%20at%205.12.49%20PM.png"/>
  
  <h3> :camera: Input file VS. Modified output file </h3>
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/b5e24ecada407949e1561310abf6004abeefec03/Delivery1/Screen%20Shot%202023-03-29%20at%205.13.48%20PM.png"/>
</div>

  </details>

<details>
  
  <summary>✓ Delivery 2</summary>
  
  - [x] A Java program based on Antlr that takes a java code (input.txt) and injects code into it, generating a modified java file (output1.java). When (output1.java) is run, the visited blocks from this code are detected and stated in a text file (output2.txt).

  <div align="center">
  <h3> :camera: Output files </h3>
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/ebebd2c66531984decaf52e690506bef560d0b8e/Delivery2/Screen%20Shot%202023-03-29%20at%206.09.42%20PM.png"/>
  
  <h3> :camera: Input file VS. Output text file containing visited blocks numbers </h3>
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/ebebd2c66531984decaf52e690506bef560d0b8e/Delivery2/Screen%20Shot%202023-03-29%20at%206.18.47%20PM.png"/>
  </div>
  
</details>


<details>
  <summary>✓ Delivery3</summary>
  
  - [x] Generate an HTML where red-highlighted code blocks are the ones that have not been visited and the green-highlighted code blocks are the ones that have been visited
  - [x] Branch coverage report: note the highlighted ```x == 0 || y == 1 || y == 5``` in red

  ### :test_tube: Test 1
  
  ```
      class main {
      public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if(x == 0 || y == 1 || y == 5){
          y = 10;
        }
        else {
          if(true){
            x++;
          }
        }
        for(int i = 0; i<3 ; i++) x++;
        while(y < 5) y = 5;
        while(y < 3 || y < 5) y = 4;
        if(true){
          y++;
        }
        int a[] = {1,2,3};
        for (int i = 0 ; i<4 ;i++){
        }
        {
        int z;
      }
      }
    }
  ```
  
  <h3> :camera: Output HTML </h3>
  <div align="center">
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/569ad8878b5300d0c88d9d7263e73a173c64ce7f/Delivery3/Test%201/html1.png"/>
  </div>
  
  <h3> :camera: Input code, Output modified code, text files containing the indeces of covered blocks & branches </h3>
  <div align="center">
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/67af59041b0cdd6cc2913b0f58cac186db3635d0/Delivery3/Test%201/output1.png"/>
  </div>
  

  - [x] Automated pipeline
  
  <h3> :test_tube: Running "Test.java" automatically generates all the files highlighted in blue </h3>
  <div align="center">
 <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/e16625c391748942c9e1ca8486b9e66a7d565792/Delivery3/pipeline.png"/>
  </div>
  
  - [x] Testing diverse code cases

### :test_tube: Test 2
  
  ```
    public class Prime {
      public static void main(String[] args) {

          int low = 20, high = 50;

          while (low < high) {
              if(checkPrimeNumber(low))
                  System.out.print(low + " ");

              ++low;
          }
      }

      public static boolean checkPrimeNumber(int num) {
          boolean flag = true;

          for(int i = 2; i <= num/2; ++i) {

              if(num % i == 0) {
                  flag = false;
                  break;
              }
          }

          return flag;
      }
  }
  ```
  
  <h3> :camera: Output HTML </h3>
  <div align="center">
  <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/Clara-Raef-delivery3/Delivery3/Test%202/html2.png"/>
  </div>
  
  <h3> :camera: Input code, Output modified code, text files containing the indeces of covered blocks </h3>
  <div align="center">
  <img src="https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/Clara-Raef-delivery3/Delivery3/Test%202/output2.png"/>
  </div>
  
  ### :test_tube: Test 3
  
  ```
    public class PositiveNegative {

    public static void main(String[] args) {

        double number = 12.3;

        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        else
            System.out.println(number + " is a positive number.");

    }
}

  ```
  
  <h3> :camera: Output HTML </h3>
  <div align="center">
  <img src="[https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/Clara-Raef-delivery3/Delivery3/Test%203/html3.png"/>
  </div>
  
  <h3> :camera: Input code, Output modified code, text files containing the indeces of covered blocks </h3>
  <div align="center">
  <img src='https://github.com/Clara-Raef/DynamicCodeAnalyzer-CompilerProject/blob/Clara-Raef-delivery3/Delivery3/Test%203/output3.png/>
  </div>

</details>

  ### References
- https://stackoverflow.com/questions/14519416/a-difference-between-statement-and-decision-coverage#:~:text=Statement
- https://github.com/antlr/intellij-plugin-v4
- https://github.com/antlr/grammars-v4/tree/master/java/java
