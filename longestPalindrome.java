package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longestPalindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		String str1=new String();
		String longest=new String("");
		StringBuffer sb=new StringBuffer();
		System.out.println("enter any string :");
		str=br.readLine();
		int j=0;
		char cr1[]= {};
		
		String[] sr1=new String[str.length()];
		System.out.println("done");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			cr1[j]=str.charAt(i);
			j++;
			System.out.println("done");
			str1=cr1.toString();
			sb.append(str1);
			sb.reverse();
			if(str1.equals(sb))
			{
				if(sb.length()>longest.length())
				longest=str1;
			}
			sb.delete(0,sb.length());
		}
		
	}

}
