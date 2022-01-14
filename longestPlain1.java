package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class longestPlain1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		int i=0,j=0;
		String str=new String();
		String str1=new String();
		String longest=new String("");
		StringBuffer sb=new StringBuffer();
		System.out.println("enter any string :");
		str=sc.nextLine();
		int n=str.length();
		for(int i=0;i<str.length();i++)
		{
//			System.out.println(i +" = "+str.charAt(i));
				for(int j=str.length()-1;j>=i;j--)
				{
					if(str.charAt(j)==str.charAt(i))
						System.out.println("  J = "+str.charAt(j) +" I = "+str.charAt(i));

				}
				}
	}
	
}
//str1=str.substring(i,j);
//sb.append(str1);
//sb.reverse();
//if(sb.equals(str1))
//{
//	if(sb.length()>str1.length())
//	{
//	longest=str1;
//	}
//	
//}
//sb.delete(0,sb.length());
//str1="";
