package operator;
import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		int sum=a+b;
System.out.println("sum:"+(sum));
		int sub=a-b;
		System.out.println("sub:"+(sub));
		int mul=a*b;
		System.out.println("mul:"+(mul));
		int div=a/b;
		System.out.println("div:"+(div));
		

	}

}
