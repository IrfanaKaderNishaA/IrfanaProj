package Java;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int a=2,count=0;
		for(a=2;a<n;a++) {
			if(n%a==0) {
				count++;
				break;	
			}
			a++;
		}
		if(count==0) {
			System.out.println("the number is prime:"+n);
		}
		else {
			System.out.println("the number is not prime:"+n);
		}

	}

}
