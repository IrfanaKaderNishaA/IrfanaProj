package Java;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				int f0=0,f1=1,f2;
				System.out.println("Enter the number of series:");
				int n=sc.nextInt();
				System.out.print(f0 + " " + f1 + " ");
					for(int i=3;i<=n;i++)
				{
				    
				    f2=f0+f1;
				    System.out.print(" " +f2);
				    f0=f1;
				    f1=f2;
			}

		}
		}

	


