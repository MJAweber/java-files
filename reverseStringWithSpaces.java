package string;
import java.io.*;
public class reverseStringWithSpaces {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=new String();
		String str1=new String();
		String check=new String("");
		StringBuffer sb=new StringBuffer();
		str=br.readLine();
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==32 || i==str.length()-1)
			{
				if(i==str.length()-1)
					str1=str.substring(j,i+1);
				else
					str1=str.substring(j,i);
				
				sb.append(str1);
				sb.reverse();
				check+=sb.toString()+" ";
				sb.delete(0, sb.length());
				j=i+1;
			}
			
		}
		 check=check.trim();
		System.out.println("After Reverse : ");
		System.out.println(check);
	}
}
//if(str.charAt(i)!=32)
//	a1[j++]=str.charAt(i);
//else
//{
//	str1=a1.toString();
//	System.out.println(str1);
//	return;
//}