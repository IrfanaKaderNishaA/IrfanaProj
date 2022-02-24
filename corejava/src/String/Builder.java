package String;

public class Builder {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Irfana");
		System.out.println(str.append("Nisha"));
		System.out.println(str.appendCodePoint('5'));
		System.out.println(str.chars());
    	System.out.println(str.capacity());
    	System.out.println(str.CodePointAt("Irfana"));

	}

}
