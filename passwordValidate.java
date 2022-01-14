package string;
import java.util.*;
public class passwordValidate {
	
	public static void main(String[] args)
	{
		String pass=new String();
		Scanner sc=new Scanner(System.in);
		
		while(2>1)
		{
			int uc=0,num=0,check=0;
			System.out.println("enter password ::");
		pass=sc.nextLine();
		if(pass.length()<6)
		{
			System.out.println(" * Less than 6 character is not allowed");
			check=1;
			continue;
		}
		else if(pass.length()>10)
		{
				System.out.println(" * Maximum 10 character is allowed");
				check=1;
				continue;	
		}
		for(int i=0;i<pass.length();i++)
		{
			if(pass.charAt(i)>=97 && pass.charAt(i)<=122 )
			{
				uc=1;
			}
			if(pass.charAt(i)>=65 && pass.charAt(i)<=90)
			{
				uc=1;
			}
			if(pass.charAt(i)>=48 && pass.charAt(i)<=57 )
			{
				num=1;
			}
		}
		if(uc==0)
		{
			System.out.println(" * Atleast one character is Required ");
			check=1;
			continue;
		}
		if(num==0)
		{
			System.out.println(" * Atleast Number is required");
			check=1;
			continue;
		}
		if(check==0)
		{
			System.out.println("plz enter password again");
		break;
		}
		
	}
		String pass1=new String();
		while(2>1)
		{
		System.out.println("enter password : again:");
		pass1=sc.nextLine();
		if(pass.equals(pass1))
		{
			System.out.println("password set successfully ! good bye");
			break;
		}
		else
		{
			System.out.println("password doesn't match to previous one");
			continue;
		}
		}
	}
	}
