package string;

import java.util.Scanner;

public class countWhitespaces {

	public static void main(String[] args) {
		int spaces = 0;
		String str = new String(
				"Home is the place , when you have to go there , they have to take you in .- Robert Frost");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 32)

				spaces++;
		}
		System.out.println("total no. of white spaces is :" + spaces);

	}

}
