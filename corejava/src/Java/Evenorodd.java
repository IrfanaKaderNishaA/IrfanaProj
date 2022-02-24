package Java;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		switch(number%2) {
		case 1:
			System.out.println("The number is even");
			break;
		case 0:
			System.out.println("The number is odd");
			break;
		}

	}

}
