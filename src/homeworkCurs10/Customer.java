package homeworkCurs10;

public class Customer {

	private static String name;
	private String address;
	private String email;

	public Customer(String name, String address, String email) {
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public static String getName() {
		return name;
	}

}
