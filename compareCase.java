package string;

public class compareCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int spaces = 0;
		String str = new String("mohit  agrawal");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32)

				spaces++;
		}
		System.out.println("total no. of white spaces is :" + spaces);
		
	}

}
