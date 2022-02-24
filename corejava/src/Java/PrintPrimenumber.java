package Java;
import java.util.Scanner;
public class PrintPrimenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,count;
	System.out.println("enter n:");
		int n=sc.nextInt();
		System.out.println("Prime numbers from 1 to "+n+" are:");
		for(int j=2;j<=n;j++) {
			count=0;
			for(i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}if(count==2)
				System.out.print(j+" ");
		}
	}

}
