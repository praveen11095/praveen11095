import java.util.Scanner;


public class twothree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		 m = in.nextInt();
	     n = in.nextInt();
	     while(m != n)
         {
             if(m > n)
                 m = m-n;
             else
                 n = n-m;
         }
         System.out.print(+m);
	     }
	}


