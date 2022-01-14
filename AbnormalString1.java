package string;

import java.util.*;

public class AbnormalString1 {
	public static String solve(String str){
	String str1=new String("");
//	removing all un-necessary character
//	ascii value of "-" is 45
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i)>=48 && str.charAt(i)<=57|| str.charAt(i)==45 ) {
			int f=1;
		}
		else
			str1+=str.charAt(i);
		}
//	taking an array to split it from space
	String[] ar1=str1.split(" ");
//	sorting manually
	for (int i = 0; i < ar1.length - 1; i++) {
		for (int j = i + 1; j < ar1.length; j++) {
			if (ar1[i].compareToIgnoreCase(ar1[j]) < 1) {
				String temp = ar1[i];
				ar1[i] = ar1[j];
				ar1[j] = temp;
			}
		}
	}
//	Arrays.sort(ar1,Collections.reverseOrder());
	str1="";
	for (String a : ar1)
		str1 += a + " ";

	str1 = str1.trim();
	return(str1);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter string =");
	String str = new String();
	str = sc.nextLine();
	String ans=solve(str);
    System.out.println("final result="+ans);
}
}
