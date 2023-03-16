package practice;

import java.util.Map;

public class Customer {
	
	private int cid;
	private String cname;
	private String cph;
	private Map<Address,Admin> address;
	
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Customer(String cph) {
		super();
		this.cph = cph;
	}




	public Customer(String cname, String cph, Map<Address, Admin> address) {
		super();
		this.cname = cname;
		this.cph = cph;
		this.address = address;
	}








	public Customer(int cid) {
		super();
		this.cid = cid;
	}




	public Customer(int cid, String cname, String cph, Map<Address, Admin> address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cph = cph;
		this.address = address;
	}




	@Override
	public String toString() {
		return "Customer [cid=" + cid +"/n, cname=" + cname + "/n, cph=" + cph + "/n, address=" + address + "/n]";
	}
   

	
	
	
}
