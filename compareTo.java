package string;

import java.util.Scanner;

public class compareTo {

	public static void main(String[] args) {
		String str1=new String("mohit");
		String str2=new String("aman");
		String str3=new String("mohit");
		Scanner sc=new Scanner(System.in);
		System.out.println(str1.compareTo(str3));//0
		System.out.println(str1.compareTo(str2));//positive value
		System.out.println(str2.compareTo(str3));// negative value
	}

}
