package Java;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter a:");
				int a=sc.nextInt();
				if(a>=90)
				{
					System.out.println("Excellent");
				}
				else if(a<90 && a>=80)
				{ 
					System.out.println("Very good");
				}
				else if(a<80 && a>=70) {
					System.out.println("Good");
				}else if(a<70 && a>=60) {
					System.out.println("Satisfactory");
				}
				else if(a<60 && a>=50) {
					System.out.println("Work hard");
				}
				else if(a<50 && a>=40) {
					System.out.println("Just pass");
				}
				else {
					System.out.println("Failed");
				}
		

	}

}
