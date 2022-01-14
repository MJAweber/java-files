package string;
public class taxReturn {
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
 public taxReturn(String security_number, String last_name, String first_name, String address, String city,
			String state, String zip_code, float income,String martial, float tax) {
		this.security_number = security_number;
		this.last_name = last_name;
		this.first_name = first_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
		this.income = income;
		this.martial = martial;
		this.tax = tax;
	}
	public String toString() {
		return "security_number=" + security_number + "\nlast_name=" + last_name + "\nfirst_name="
				+ first_name + "\naddress=" + address + "\ncity=" + city + "\nstate=" + state + "\nzip_code=" + zip_code
				+ "\nincome=" + income + "\nmartial_status=" + martial + "\ntax liability=" + tax + "]";
	}
}
