 import java.io.PrintWriter;
import java.io.FileNotFoundException;
class main {
private static PrintWriter blocks;
    private static PrintWriter branches;

  public static void main(String[] args) throws FileNotFoundException{//block 1
  blocks = new PrintWriter("textoutput/output1blocks.txt");

  branches = new PrintWriter("textoutput/output1branches.txt");

		 blocks.println("block #1 is visited");

    for (int i = 1; i <= 5; i++) {//block 2
		 blocks.println("block #2 is visited");

   for (int j = 1; j <= i; j++) {//block 3
		 blocks.println("block #3 is visited");

      for (int k = 1; k <= j; k++) {//block 4
		 blocks.println("block #4 is visited");

         for (int l = 1; l <= k; l++) {//block 5
		 blocks.println("block #5 is visited");

            for (int m = 1; m <= l; m++) {//block 6
		 blocks.println("block #6 is visited");

               if (m == 3 && l == 2 && k == 2 && j == 2) {
		
		//block 7
		 blocks.println("block #7 is visited");

                  break; // exit the loop if condition is met
               }
               System.out.print(m + " ");
            }
            System.out.println();
         }
      }
   }
}
   blocks.close();
branches.close();
}
}