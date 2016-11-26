import java.util.Scanner;


public class nineteen {

	public static void main(String[] args)
	{
		int i,fact = 1,factorial;
		int num;;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		num = in.nextInt();
		for (i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("the factorial is"  +fact);
	}
}
