import java.util.Scanner;
public class twotwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,i,n;
		Scanner in = new Scanner(System.in);
		System.out.print("  enter the value");
		n = in.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=0;i<=n;i++)
			{
			c=a+b;
			System.out.println(c);
			a = b;
			b = c;
			}
		

	}

}
