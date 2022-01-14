package string;

public class demonstrateStringMethods {

	public static void main(String[] args) {
		String str=new String("It is better to deserve honours and not have them than to have them and not deserve them .- Mark Twain");
		System.out.println("indexOf(h) = "+str.indexOf('h'));
		System.out.println("charAt() = "+ str.charAt(14));
		System.out.println("endsWith()  = "+str.endsWith("Twain"));
		System.out.println("replace()  = "+str.replace('a', 'A'));
		
	}
}
