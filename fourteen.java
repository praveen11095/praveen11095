import java.util.Scanner;


public class fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m=0,i,flag=0;
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		m= n/2;
		for(i=2;i<=m;i++)
        if(n%i==0)		
        {
        	System.out.println("is a not prime number");
        	flag=1;
        	break;
        }
        	if(flag==0)
        	{
        		System.out.println("is prime number");
        	}
		
	}

}
