# praveen11095
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class vowrcon {

	public static void main(String[] args) throws IOException {
		char c;
		System.out.println("enter the char");
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		  c = (char) bf.read();
		switch(c)
		{
		case 'a':
			System.out.println("the letter is vowel	"+c);
			break;
		case 'e':
			System.out.println("the letter is vowel	"+c);
			break;
		case 'i':
			System.out.println("the letter is vowel	"+c);
			break;
		case 'o':
			System.out.println("the letter is vowel	"+c);
			break;
		case 'u':
			System.out.println("the letter is vowel	"+c);
			break;
			default:
				System.out.println("the letter is consonent  "+c);
				break;
		}
		
		
				
		
		
		// TODO Auto-generated method stub

	}

}
