package practice;

public final class Admin {

	
	private int aid;
	private String aname;
	private String email;
	
	
	
	public Admin(int aid, String aname, String email) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.email = email;
	}



	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", email=" + email + "]";
	}
	
	
	
}
