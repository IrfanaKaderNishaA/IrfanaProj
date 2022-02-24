package Java;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int reverse=0;
	    while(n!=0) {
			int a=n % 10;
			reverse=reverse*10+a;
			n=n/10;	
			
		}System.out.println("reversed number is:" +reverse);
	}

}
