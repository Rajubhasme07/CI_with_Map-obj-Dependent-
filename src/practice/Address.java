package practice;

public class Address {

	private String City_code;
	private String Street_add;
	private int pin_code;
	


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Address(String city_code, String street_add, int pin_code) {
		super();
		City_code = city_code;
		Street_add = street_add;
		this.pin_code = pin_code;
	}





	public Address(int pin_code) {
		super();
		this.pin_code = pin_code;
	}





	public Address(String street_add) {
		super();
		Street_add = street_add;
	}







	@Override
	public String toString() {
		return "Address [City_code=" + City_code + ", Street_add=" + Street_add + ", pin_code=" + pin_code + "]";
	}
	
	
	
	
	
}
