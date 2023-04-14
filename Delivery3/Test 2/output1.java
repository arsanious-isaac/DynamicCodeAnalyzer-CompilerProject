 import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Prime {
private static PrintWriter blocks;
    private static PrintWriter branches;

    public static void main(String[] args) throws FileNotFoundException{//block 1
  blocks = new PrintWriter("textoutput/output1blocks.txt");

  branches = new PrintWriter("textoutput/output1branches.txt");

		 blocks.println("block #1 is visited");


        int low = 20, high = 50;

        while (low < high) {
		
		//block 2
		 blocks.println("block #2 is visited");

            if(checkPrimeNumber(low))
                {//block 3
		 
		 blocks.println("block #3 is visited");
System.out.print(low + " ");}

            ++low;
        }
     blocks.close();
branches.close();
}

    public static boolean checkPrimeNumber(int num) {//block 4
		 blocks.println("block #4 is visited");

        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {//block 5
		 blocks.println("block #5 is visited");


            if(num % i == 0) {
		
		//block 6
		 blocks.println("block #6 is visited");

                flag = false;
                break;
            }
        }

        return flag;
    }
}