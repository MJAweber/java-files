package string;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel = 0;
//		String str = new String(
//				"Home is the place , when you have to go there , they have to take you in .- Robert Frost");
		String str=new String();
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
				
				vowel++;
		}
		System.out.println("total no. of vowel is :" + vowel);

	}

}
