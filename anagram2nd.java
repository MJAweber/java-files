package string;

import java.util.Scanner;

public class anagram2nd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = new String();
		System.out.println("enter First string :");
		str1 = sc.nextLine();
		String str2 = new String();
		System.out.println("enter second string :");
		str2 = sc.nextLine();
		if (str1.length() != str2.length()) {
			System.out.println("string is not anagram because , length is not same");
			return;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		char ar1[] = str1.toCharArray();
		char ar2[] = str2.toCharArray();
		int sum1 = 0;
		int sum2 = 0;
		for (char a : ar1)
			sum1 = sum1 + a;

		for (char a : ar2)
			sum2 = sum2 + a;

		if (sum1 == sum2)
			System.out.println("String is anagram");
		else
			System.out.println("string is not anagram because , characters are not same");
	}
}
