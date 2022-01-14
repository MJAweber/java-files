package string;
import java.util.*;
// anagram of string
public class anagram {
	static char[] sort(char[] ar)
	 {
		char temp;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
					if(ar[i]>ar[j])
					{
						temp=ar[j];
						ar[j]=ar[i];
						ar[i]=temp;
					}
			}
		}
		return ar;
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s1[],s2[];
		String str1=new String();
		str1=sc.nextLine();
		String str2=new String();
		str2=sc.nextLine();
		if(str1.length()==str2.length())
			System.out.println("string is not anagram because , length is not same");
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char ar1[]=str1.toCharArray();
		char ar2[]=str2.toCharArray();
		int sum1=0;
		int sum2=0;
			ar1=sort(ar1);
			ar2=sort(ar2);
			for( char a:ar1)
				 sum1=sum1+a;

			for( char a:ar2)
			 sum2=sum2+a;

			if(sum1==sum2)
			System.out.println("String is anagram");
		else
			System.out.println("string is not anagram because , characters are not same");
	}
}
