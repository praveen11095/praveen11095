import java.util.Scanner;
public class thirteen {
	public static void main(String[] args)
	{
     int sum =0, r,n,temp;
    Scanner in = new Scanner(System.in);
    System.out.println("the number is");
    n = in.nextInt();
    temp = n;
	
    while(n<0) 
    {
    	r = n/10;
    	sum = (sum*10)+r;
    	n = n/10;
    }
    if(temp == sum)
    {
    	System.out.println("it is a palindrome");
    }
    else
    {
    	System.out.println("it is not a palindrome");
    }
     
	}    
}
