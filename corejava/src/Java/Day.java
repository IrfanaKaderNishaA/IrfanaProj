package Java;
import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int day=sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Today is sunday");
			break;
		case 2:
			System.out.println("Today is monday");
			break;
		case 3:
			System.out.println("Today is tuesday");
			break;
		case 4:
			System.out.println("Today is wednesday");
			break;
		case 5:
			System.out.println("Today is thursday");
			break;
		case 6:
			System.out.println("Today is friday");
			break;
			default:
				System.out.println("Today is saturday");
				
			
			
		}

	}

}
