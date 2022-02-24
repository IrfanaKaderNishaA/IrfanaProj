package Java;
import java.util.Scanner;
public class Switchoperators {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("\n 1 Addition");
		System.out.println("\n 2 Subtraction");
		System.out.println("\n 3 Multiplication");
		System.out.println("\n 4 Division");
		System.out.println("\n 5 Modulo");
         int choice=sc.nextInt();
		System.out.println("Enter two integers a,b:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(choice>0)
		{
			switch(choice) {
			case 1:
				System.out.println("Addition");
			   int  c=a+b;
				System.out.println("Addition is"+c);
				break;
			case 2:
				System.out.println("Subtraction");
		        c=a-b;
		        System.out.println("Subtraction is"+c);
				break;
			case 3:
				System.out.println("Multiplication");
		         c=a*b;
		         System.out.println("Multiplication is"+c);
				break;
			case 4:
				System.out.println("Division");
				c=a/b;
				System.out.println("Division is"+c);
				break;
			case 5:
				System.out.println("Modulo");
				c=a%b;
				System.out.println("Modulo is"+c);
				break;
				default:
					System.out.println("Invalid operator");
			}}
		}while(true);	
				
	}

	}

