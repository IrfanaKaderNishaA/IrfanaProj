package Java;
import java.util.Scanner;
public class Operations {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two integers");
		int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c;
	    System.out.println("Enter an operator");
		char operator=sc.next().charAt(0);
	    switch(operator) {
		case '+':
			c=a+b;
			System.out.println("sum"+c);
			break;
		case '-':
			c=a-b;
			System.out.println("sub"+c);
			break;
		case '*':
			c=a*b;
			System.out.println("mul"+c);
			break;
		case '/':
			c=a/b;
			System.out.println("div"+c);
			break;
		case '%':
			c=a%b;
			System.out.println("mod"+c);
			break;
			default:
				System.out.println("Invalid operator");
		}

	}

}
