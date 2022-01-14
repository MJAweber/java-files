package string;
import java.util.Scanner;
public class constructID {
	public static void main(String[] args) {
		String name=new String();
		String street=new String();
		String id=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name = ");
		name=sc.nextLine();
		System.out.println("enter street address in format 34 Elm , 1778 monre");
		street=sc.nextLine();
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				if (name.charAt(0) != 32)
					id += name.charAt(0);
			}

			if (name.charAt(i) == 32) {
				if (name.charAt(i + 1) != 32)
					id += name.charAt(i + 1);
			}
		}
//		getting street number
		for (int i = 0; i < street.length(); i++) {
			if(street.charAt(i)>=48 && street.charAt(i)<=57)
				id+=street.charAt(i);
		}
		System.out.println("your id is  : "+id.toUpperCase());
	}
}
