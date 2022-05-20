package frame;

public class Bookings {
	protected String name;
	protected String username;
	protected String phonenumber;
	protected String address;
	protected String roomtype;
	protected String bedcount;
	protected String noofperson;
	protected String checkindate;
	protected String checkoutdate;
	protected String roomname;
	
	Bookings(String username,String roomtype, String bedcount,String noofperson,String checkindate,String checkoutdate, String roomname){
		
		this.username=username;
		this.roomtype=roomtype;
		this.bedcount=bedcount;
		this.noofperson=noofperson;
		this.checkindate=checkindate;
		this.checkoutdate=checkoutdate;
		this.roomname=roomname;
	    for(Registration collect:Validation.Regarray) {
	    	if(username.equals(collect.getUsername())) {
	    		this.name=collect.getName();
	    		this.phonenumber=collect.getPhoneNumber();
	    		this.address=collect.getAddress();
	    	}
	    }
	}
	
	public String getDetails() {
		   String details=" Name : "+this.name+"\n username : "+this.username+"\n Room Name : "
	               +this.roomname+"\n Room Type : "+this.roomtype+"\n No Of Bed : "+this.bedcount
				   +"\n No Of person : "+this. noofperson+"\n Check In On : "+this.checkindate+"\n Check Out : "
	               +this.checkoutdate+"\n Phone Number : "+this.phonenumber+"\n Your Address :"+this.address;
		
		   return details;
	}
	
	
	
	
	

}
