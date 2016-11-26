import java.util.Scanner;
public class eighteen {
	  public static void main(String[] args) 
	     {
	        int n,  a,j, b, c, sum = 0;
	      
	        Scanner in = new Scanner(System.in);
	        System.out.print("enter the highest range" );
	       j = in.nextInt();
	 
	        for(int i = 2; i <= j; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum =0;
	   }  
	}  
}
