import java.util.*;
public class digit {
	public static void main(String[] args)
	
	{
		int n,i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		n = in.nextInt();
		while(n>0)
		{
			
			n = n/10;
			i++;
		
		}
			{
				System.out.println("the value is "  +i);
				
		}
	
	
	}
}
