import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the year");
		n = in.nextInt();
		if(n%4==0 && n%100!=0 ||n%400==0)
		{
			System.out.println("the year is leap year");
		}else
			System.out.println("the year is not a year");
	
	}

}
