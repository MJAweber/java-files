package string;

import java.util.Scanner;

public class threeLetterAcronym {

	public static void main(String[] args) {

		String str = new String();
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		String acronym = new String("");
		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				if (str.charAt(0) != 32)
					acronym += str.charAt(0);
			}

			if (str.charAt(i) == 32) {
				if (str.charAt(i + 1) != 32)
					acronym += str.charAt(i + 1);
			}
		}
		System.out.println("Acronym of " + str + " is \n = :::>" + acronym.toUpperCase());

	}

}

