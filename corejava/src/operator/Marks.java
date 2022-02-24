package operator;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
				int s1,s2,s3,s4;
				float sum,average,percentage;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the marks:");
				s1=sc.nextInt();
				s2=sc.nextInt();
				s3=sc.nextInt();
				s4=sc.nextInt();
				float total=s1+s2+s3+s4;
				total=sc.nextFloat();
				average=total/4;
			    percentage=(total/400)*100;
			    System.out.println(total);
			    System.out.println(average);
			    System.out.println(total);
			    
				
						
	}

}

