package string;
import java.util.Scanner;
class removeAdjacentDuplicates
{
	
	public static void main(String[] args)
	{
		String str=new String();
		String str1="";
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int c=0,f=0;
		char ar1[]=str.toCharArray();
		for(int i=0;i<ar1.length;i++)
		{
			c=0;
			for(int j=i;j<ar1.length;j++)
			{
				if(ar1[i]!=ar1[j])
					break;
				else
				{
				++c;
				f=1;
				}
			}
			// adding character
			if(c<2)
			str1+=ar1[i];
			
			if(c>1)
			i+=c-1;	
		}
		System.out.println(str1);
		
		
		
	}
}