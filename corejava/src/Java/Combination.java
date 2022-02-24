package Java;
import java.util.Scanner;
public class Combination {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				do{
					System.out.println("\1 Sum of Digits");
					System.out.println("\2 Factorial");
					System.out.println("\3 Fibonacci sequence");
					System.out.println("Enter the choice:");
					int c=sc.nextInt();
					System.out.println("Enter the number:");
					int num=sc.nextInt();
				
			        switch(c) {
						case 1:
							int sum=0;
							for(int i=1;i<=num;i++)
							{
								sum+=i;
							}System.out.println("Sum of Digits:"+sum);
							
							break;
						case 2:
							int fact=1;
							for(int i=1;i<=num;i++)
							{
								fact=fact*i;
								
							}System.out.println("Factorial:"+fact);
							break;
						case 3:
							int f0=0,f1=1,f2;
							System.out.print(f0 + " " + f1 + " ");
							for(int i=3;i<=num;i++)
							{
								
								f2=f0+f1;
								System.out.print(f2 + " ");
								f0=f1;
								f1=f2;
							}
							break;
						  
						}
				}
				while(true);

			
			}
		}



	


