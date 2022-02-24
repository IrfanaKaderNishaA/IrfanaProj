package String;

public class Buffer {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Irfana");
		System.out.println(str.insert(5,'K'));
		System.out.println(str.capacity());
		System.out.println(str.reverse());
		System.out.println(str.delete(2,5));
		System.out.println(str.append("Nisha"));
	}

}
