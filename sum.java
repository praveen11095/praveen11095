import java.util.Scanner;
class sum{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int[] array = new int[6];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<6 ; i++)
      {
    	  array[i] = in.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}

