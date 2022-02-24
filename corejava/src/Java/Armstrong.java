package Java;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int c=0,a,b;
		a=n;
		while(a>0)
		{
			b=a%10;
			c=c+(b*b*b);
			a=a/10;
		}
if(n==c) {
	System.out.println("Armstrong number");
}
else {
	System.out.println("Not Armstrong number");
}
	}

}
