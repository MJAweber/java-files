package string;
import java.util.*;
public class countAllCharacter {

	public static void main(String[] args) {
		int num=0,vow=0,sp=0,con=0,ch=0;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("enter string :");
		str=sc.nextLine();
		// changing string to lower case
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122 )
			{
				ch++;
					if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
							|| str.charAt(i) == 'u' )
					{
						vow++;
					}
					else
						con++;
//					else if(!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
//							|| str.charAt(i) == 'u'))
//					{
//						con++;
//					}
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57 )
			{
				num++;
			}
			else
				sp++;
		}
		System.out.println("total characters :"+ch);
		System.out.println("in which :");
		System.out.println("\t vowels :"+vow);
		System.out.println("\t consonants :"+con);
		System.out.println("total number  :"+num);
		System.out.println("total special :"+sp);
	}
}	

//|| str.charAt(i)>=65 && str.charAt(i)<=90
//|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
//|| str.charAt(i) == 'O' || str.charAt(i) == 'U'
// || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
//|| str.charAt(i) == 'O' || str.charAt(i) == 'U'