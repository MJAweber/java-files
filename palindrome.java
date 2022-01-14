package string;

import java.io.*;

public class palindrome {
	public static void main (String[] args) throws IOException
	{
		int j=0,f=0;
		String str=new String();
		String check=new String("");
		
			String str1=new String("");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string :");
		str=br.readLine();
		j=str.length()-1;
		for(int i=0;i<str.length();i++,--j)
		{
			
			if(str.charAt(i)!=str.charAt(j))
			{
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("string is palindrome");
		else
			System.out.println("string is not ::: palindrome");
		
		
	
		
	}

}
