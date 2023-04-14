 import java.io.PrintWriter;
import java.io.FileNotFoundException;
class main {
private static PrintWriter blocks;
    private static PrintWriter branches;

  public static void main(String[] args) throws FileNotFoundException{//block 1
  blocks = new PrintWriter("textoutput/output1blocks.txt");

  branches = new PrintWriter("textoutput/output1branches.txt");

		 blocks.println("block #1 is visited");

    int x = 0;
    int y = 0;
    if(x == 0 || y == 1 || y == 5){
		for(int i = 0; i != 1 ;){
		 if (x==0) i = 1; 
		 if(i==1)branches.println("branch of block #2 is not covered"); else if (y==1) i = 1; 
		 if(i==1)branches.println("branch of block #2 is not covered"); else if (y==5) i = 1;
	}
		//block 2
		 blocks.println("block #2 is visited");

      y = 10;
    }
    else {//block 3
		 blocks.println("block #3 is visited");

      if(true){
		
		//block 4
		 blocks.println("block #4 is visited");

        x++;
      }
    }
    for(int i = 0; i<3 ; i++) {//block 5
		 blocks.println("block #5 is visited");
x++;}
    while(y < 5) {//block 6
		 
		 blocks.println("block #6 is visited");
y = 5;}
    while(y < 3 || y < 5) {//block 7
		 for(int i = 0; i != 1 ;){
		 if (y<3) i = 1; 
		 if(i==1)branches.println("branch of block #7 is not covered"); else if (y<5) i = 1;
	}
		 blocks.println("block #7 is visited");
y = 4;}
    if(true){
		
		//block 8
		 blocks.println("block #8 is visited");

      y++;
    }
    int a[] = {1,2,3};
    for (int i = 0 ; i<4 ;i++){//block 9
		 blocks.println("block #9 is visited");

    }
    {//block 10
		 blocks.println("block #10 is visited");

    int z;
  }
   blocks.close();
branches.close();
}
}