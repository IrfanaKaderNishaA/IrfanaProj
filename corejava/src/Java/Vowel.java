package Java;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the letter");
		char letter=sc.next().charAt(0);
	   
		switch(letter) {
		case 'a':
			System.out.println("The letter is vowel");
			break;
		case 'e':
			System.out.println("The letter is vowel");
			break;
		case 'i':
			System.out.println("The letter is vowel");
			break;
		case '0':
			System.out.println("The letter is vowel");
			break;
		case 'u':
			System.out.println("The letter is vowel");
			break;
			default:
				System.out.println("The letter is consonent");
				
			
		}

	}

}
