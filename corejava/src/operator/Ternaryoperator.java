package operator;

public class Ternaryoperator {
	public static void main(String[] args) {
		int a=2,b=5,c=8;
		int d = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
		System.out.println(d);
	}
	

}
