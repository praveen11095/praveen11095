import java.util.Scanner;
public class twofour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,i,r=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		num = in.nextInt();
		while(num!=0){
	    i = num%10;
	    r =  r*10+i;
	    num = num/10;
		}
		{
	    System.out.print(r);
		}

	}

}
