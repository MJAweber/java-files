package string;

import java.util.Scanner;

public class prepareTax extends taxReturn{
	public prepareTax(String security_number, String last_name, String first_name, String address, String city,
			String state, String zip_code, float income, String martial, float tax) {
		super(security_number, last_name, first_name, address, city, state, zip_code, income, martial, tax);
	}
	public static void main(String[] args) {
		
		String security_number;
		String last_name;
		String first_name;
		String address;
		String city;
		String state;
		String zip_code;
		float income;
		String martial;
		float tax;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter social security number = ");
		security_number = sc.nextLine();
		System.out.println("enter last name = ");
		last_name = sc.nextLine();
		System.out.println("enter first name = ");
		first_name = sc.nextLine();
		System.out.println("enter address = ");
		address = sc.nextLine();
		System.out.println("enter city = ");
		city = sc.nextLine();
		System.out.println("enter state = ");
		state = sc.nextLine();
		while (2 > 1) {
			System.out.println("enter zip code = ");
			zip_code = sc.nextLine();
			if (zip_code.length() > 5 || zip_code.length() < 5) {
				System.out.println("zip code should be 5 digit");
				continue;
			} else
				break;
		}
		while (2 > 1) {
			System.out.println("enter income = ");
			income = sc.nextFloat();
			if (income < 0) {
				System.out.println("annual income is negative");
				continue;
			} else
				break;
		}
		while (2 > 1) {
			System.out.println("enter martial status= ");
			martial = sc.next();
			if (!(martial.charAt(0) == 's' || martial.charAt(0) == 'S' || martial.charAt(0) == 'M'
					|| martial.charAt(0) == 'm')) {
				System.out.println("martial status should starts with s,S,M,m only");
				continue;

			} else
				break;
		}
		tax = income + income * 5 / 100;
		taxReturn tr=new taxReturn(security_number,last_name,first_name,address,city,state,zip_code,income,martial,tax);
		System.out.println(tr.toString());
		
	}
}