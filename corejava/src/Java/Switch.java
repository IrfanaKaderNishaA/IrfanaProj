package Java;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the grade");
		int grade=sc.nextInt();
		switch(grade) {
		case 9:
			System.out.println("Grade is A");
			break;
		case 8:
			System.out.println("Grade is B");
			break;
		case 7:
			System.out.println("Grade is C");
			break;
		case 6:
			System.out.println("Grade is D");
			break;
		case 5:
			System.out.println("Grade is E");
			break;
			default:
				System.out.println("Grade is F");
	
		
		}
		

	}

}
