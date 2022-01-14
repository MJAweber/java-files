package string;
public class check {
	public static void main(String[] args) {
		String str1 = "A book";
		String str2 = "a book";
		int a = 110;
		float b = 4.5f;
		String str3 = new String("Education");
		str3.substring(5,str3.length());
		System.out.println(str3);
		String str4 = new String("    A    book    ");
		char[] a1 = { 'p', 'q', 'r', 's' };
		System.out.println(a+b);
		System.out.println(str1);
		System.out.println(a1);
		System.out.println(str1.equals(str2));
		System.out.println(str2 == str4);
		System.out.println(str2.toUpperCase());// change string to upper case
		System.out.println(str3.startsWith("E"));// check whether the string starts with 'E' or not
		System.out.println(str4.trim());// remove all leading and trailing spaces
		System.out.println(str3.substring(3, 6));// Returns a new string which is the substring
		//of a specified string
		System.out.println(str1.compareTo(str2));// compare string with available character in string
	System.out.println(str2.concat(str1));
	System.out.println(str2.equalsIgnoreCase(str4));
	String s="hello";
	String s1=new String(s);
	if("hello".equals(s))
		System.out.println("one");
	if(s1==s)
		System.out.println("two");
	if(s1.equals(s))
		System.out.println("threw");
	}
	
}
