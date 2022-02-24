package Java;

public class Arraymul {

	public static void main(String[] args) {
		int[][] a= {{3,4},{2,1}};
		int[][] b= {{1,5},{3,7}};
		int[][] Mul=new int[2][2];
		int i,j;
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++)
			{
				for(int k=0;k<2;k++) {
					Mul[i][j]=a[i][k]*b[k][i];
					
				}System.out.print(Mul[i][j]+" ");
			}System.out.println(" ");
		}

	}

}
