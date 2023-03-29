import java.io.PrintWriter;
import java.io.FileNotFoundException;
class Main {
  public static void main(String[] args) throws FileNotFoundException {//block 1
 int[] intArray = new int[20]; 
int c = 0;
		 intArray [c++] =1;
    int x = 0;
    int y = 0;
    if(x == 0){//block 2
		 intArray [c++] =2;
      y = 10;
    }
    else {//block 3
		 intArray [c++] =3;
      if(true){//block 4
		 intArray [c++] =4;
        x++;
      }
    }
    if(true){//block 5
		 intArray [c++] =5;
      y++;
    }
    int a[] = {1,2,3};
    for (int i = 0 ; x<1 ;x++){//block 6
		 intArray [c++] =6;
    }
    {//block 7
		 intArray [c++] =7;
    int w;
    int z;
  }
 PrintWriter out = new PrintWriter("output2.txt");
 for(int i=0 ; i < c; i++){
        out.println("block #"+ intArray[i] + " is visited");
 }
        out.close();
}
}