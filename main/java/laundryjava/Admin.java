package laundryjava;

public class Admin {
	
	private int adminID;
	private String adminName;
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	
	public Admin(int adminID, String adminName, String username, String password,String email,String phonenumber) {
		
		this.adminID = adminID;
		this.adminName = adminName;
		this.username = username;
		this.password = password;
		this.email=email;
		this.phonenumber=phonenumber;
	}	

	public int getAdminID() {
		return adminID;
	}

	public String getAdminName() {
		return adminName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public String getemail() {
		return email;
	}
	
	public String getphonenumber() {
		return phonenumber;
	}
	
	
}
