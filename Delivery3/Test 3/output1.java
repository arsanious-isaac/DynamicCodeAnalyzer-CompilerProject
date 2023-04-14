 import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class PositiveNegative {
private static PrintWriter blocks;
    private static PrintWriter branches;


    public static void main(String[] args) throws FileNotFoundException{//block 1
  blocks = new PrintWriter("textoutput/output1blocks.txt");

  branches = new PrintWriter("textoutput/output1branches.txt");

		 blocks.println("block #1 is visited");


        double number = 12.3;

        if (number < 0.0)
            {//block 2
		 
		 blocks.println("block #2 is visited");
System.out.println(number + " is a negative number.");}

        else
        { //block 3
            System.out.println(number + " is a positive number.");

     blocks.close();
branches.close();
}
}