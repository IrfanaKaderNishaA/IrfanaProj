package String;

public class Stringoperations {
	public static void main(String[]args)
	{
		String str="Irfana Kader Nisha";
		String str1="irfanakadernisha";
		System.out.println(str.charAt(7));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.concat(" Abubucker"));
		System.out.println(str.trim());
		System.out.println(str.startsWith("AI"));
		System.out.println(str.indexOf('a'));
		System.out.println(str1.lastIndexOf('n'));
		System.out.println(str.substring(4));
		System.out.println(str1.substring(7,12));
		System.out.println(str.replace('a','k'));
	
		
		
		
	}
}
