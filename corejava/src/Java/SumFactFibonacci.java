package Java;
import java.util.Scanner;
public class SumFactFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("\1 Sum of Digits");
			System.out.println("\2 Factorial");
			System.out.println("\3 Fibonacci sequence");
			System.out.println("Enter the choice:");
			int choice=sc.nextInt();
			System.out.println("Enter the number:");
			int n=sc.nextInt();
	        switch(choice) {
				case 1:
					int sum=0;
					for(int i=1;i<=n;i++)
					{
						sum=sum+i;
						System.out.println("Sum of Digits:"+sum);
					}
					break;
				case 2:
					int fact=1;
					for(int i=1;i<=n;i++)
					{
						fact=fact*1;
						System.out.println("Factorial: "+fact);
					}
					break;
				case 3:
					int f0=0,f1=1,f2;
					System.out.print(f0 + " " + f1 + " ");
					for(int i=3;i<=n;i++)
					{
						f2=f0+f1;
						System.out.print(f2 + " ");
						f0=f1;
						f2=f1;
					}
						break;
						default:
							System.out.println("Invalid");
				  
				}
		}
		while(true);

	
	}
}

