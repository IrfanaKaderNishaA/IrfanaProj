package Java;
import java.util.Scanner;
public class Breakstatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		while(true) {
			if(n>5) {
				break;
			}System.out.println("counting..."+n);
			n++;
		}
		

	}

}
