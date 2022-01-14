package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortString {
	static String perform(String str) {
		String str1 = "";
		String[] ar1 = str.split(" ");
//		sorting()
		String[] ar2 = sort(ar1);
//		Arrays.sort(ar1);
		Arrays.sort(ar1, Collections.reverseOrder());   
//		System.out.println("ar1="+ar1);
//		concating to string
		for (String a : ar1)
			str1 += a + " ";

		str1 = str1.trim();
		return (str1);
	}

	static String[] sort(String[] str) {
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 1) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return (str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string =");
		String str = new String();
		str = sc.nextLine();
//		calling function
		String str1 = perform(str);
		System.out.println("final result after sorting=" + str1);

	}
}
