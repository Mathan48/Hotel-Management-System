package frame;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	static ArrayList<Room> Roomarray=new ArrayList<Room>();
	static ArrayList<Registration> Regarray=new ArrayList<Registration>();
	static ArrayList<Bookings> book=new ArrayList<Bookings>();
	static int arrayCount=0;
	
	// login Validation if It correct it goes to hotel page
	
	 public static String login(String username,String password){
	       for(int count=0;count<Regarray.size();++count){
	        if(username.equals((Regarray.get(count)).getUsername())) {    
			           if(password.equals((Regarray.get(count)).getPassword())){ 
			        	     new Hotel(username);
	                         return "New"; 

	                         
	                  }
			           else return "your password is invalid";
			           }
	            
	        }
	        return "invalid user name";
		    }
	 
	 // check the room is available or nor
	 
	   public static String isRoomAvail(String roomtype,String noofbed){
		   for(Room collect:Roomarray) {
			   if(roomtype.equals(collect.roomtype)){
				   if(noofbed.equals(collect.numberofbeds)) {
					   if("available".equals(collect.available)) {
						   collect.available="unavailable";
						   return collect.roomname;
					   }
					   
				   } 
			   }   
		   }
		   return "0";
		  
	   }
	   
	    // check the password is valid or not
	   
	    public static boolean isPasswordValid(String pass) {
	 	   String regex = "^(?=.*[0-9])"
	                + "(?=.*[a-z])(?=.*[A-Z])"
	                + "(?=.*[@#$%^&+=])"
	                + "(?=\\S+$).{8,20}$";

	 	   Pattern pattern = Pattern.compile(regex);
	 	   if (pass == null) {
	            return false;
	        }
	 	   Matcher match = pattern.matcher(pass);
	 	   return match.matches();
		   }
	    
	    
	    
	    // check the username  is valid or not
	    
	    public static boolean isUserValid(String user) {
	 	   int flag=0;
		   for(int count=0;count<Regarray.size();count++) {
			     
				   if(user.equals((Regarray.get(count)).getUsername())) {
					   flag= -1;
				   }
			   }
			  if (user == null||flag==-1) {
				 
	            return false;
	        }
			 String regex = "^[A-Za-z]\\w{5,29}$";
			 Pattern pattern = Pattern.compile(regex);
	 	  
	 	   Matcher match = pattern.matcher(user);
	 	   return match.matches();
		  }
	    
	    // check bookings is available or not
	    
	    public static String getBookingDetails(String user) {
	    	 boolean flag=true;
	    	 Integer count=1;
	    	 String total=" ";
	    	 for(Bookings collect:book) {
	    		 if(user.equals(collect.username)) {
	    			 flag=false;
	    			 total=total+"\n"+ "Booking "+count.toString()+"\n"+ collect.getDetails();
	    			 ++count;
	    		 }
	    	 }
	         if(flag==true) {	    	
	        	 return "no Bookings available";
	         }
	    	return total;
	    }
	    
	    
	    
	    
	    
}
