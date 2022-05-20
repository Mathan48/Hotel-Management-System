package frame;

public class Registration {
	private String name;
	private String phonenumber;
	private String username;
	private String password;
	private String address;

	
	public Registration(String name,String phonenumber,String username,String password,String address){
		this.name=name;
		this.phonenumber=phonenumber;
		this.username=username;
		this.password=password;
		this.address=address;
	}
	
	//getmethods for accessing instance variable 
	
	public String getUsername() { 
		return this.username;
	}
	public String getPassword() { 
		return this.password;
	}
	public String getName() { 
		return this.name;
	}
	public String getAddress() { 
		return this.address;
	}
	public String getPhoneNumber() { 
		return this.phonenumber;
	}
	
	
	
}