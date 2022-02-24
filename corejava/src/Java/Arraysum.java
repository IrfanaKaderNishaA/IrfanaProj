package Java;

public class Arraysum {

	public static void main(String[] args) {
		int[][]a= {{4,5,9},{6,8,7}};
		int[][]b= {{2,3,5},{5,3,2}};
		int[][] Sum=new int[2][3];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++) {
			Sum[i][j]=a[i][j]+b[i][j];
				
			}
		}System.out.println("Sum of array:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++) {
			System.out.print(Sum[i][j]+" ");
				
			}
		
System.out.println("");
	}

	}
}


	


