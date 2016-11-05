# praveen11095
import java.util.Scanner;
public class larnum {
	public static void main(String[] args)
	{
		int a ,b,c ;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number 1  ");
		a = in.nextInt();
		System.out.println("enter the number 2  ");
		b = in.nextInt();
		System.out.println("enter the number 3 ");
		c = in.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
			else  if(b>a && b>c)   
			{
				System.out.println("b is largest");
			}	else if(c>a && c>b)
				System.out.println("c is largest");
		}
}

