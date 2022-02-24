package operator;

public class Operation {
	public static void main(String[] args){
	int a=5,b;
	 b=a++;
     System.out.println("Value of a "+a+"Value of b "+b);
     b=++a;
     System.out.println("Value of a "+a+"Value of b "+b);
     b=--a;
     System.out.println("Value of a "+a+"Value of b "+b);
     b=a--;
     System.out.println("Value of a "+a+"Value of b "+b);
	}

}
