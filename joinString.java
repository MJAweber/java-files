package string;

public class joinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=new String("Rohit Sharma");
		String profession=new String("cricket");
		String jersey_no =new String("forty five");
		
		System.out.println(name);
		System.out.println(profession);
		System.out.println(jersey_no);
		System.out.println(name.concat(profession).concat(jersey_no));
			}
}
