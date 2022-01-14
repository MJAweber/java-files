package string;
import java.util.Scanner;
public class comparisonCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("mohit");
		String str2=new String("MOHIT");
		Scanner sc=new Scanner(System.in);
		// equals case compare string with case of string
		System.out.println("checking equals() method =  "+str1.equals(str2));
		// equalsIgnoreCase compare string by ignoring case of string
		System.out.println("checking equalsIgnoreCase() method =  "+str1.equalsIgnoreCase(str2));
	}

}
