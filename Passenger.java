package airlinereservationsystem_2022;

import airlinereservationsystem_2022.Ticket;

//Inherintance to User : Passenger is a user 
public class Passenger extends User {

    private String passName;
    private int passAge;
  
    private String passpoertNum;
    private String passPhone;
    
    
	
	public Passenger(String passName,int age,String passportNum,String phone,String name,  String icNo, int gender, String phoneNo, String email, String password)
	{
            super ( name,  age,   icNo,  gender,  phoneNo,  email,  password);
            this.passName = passName;
            this.passAge = age;
		
            this.passpoertNum = passportNum;
            this.passPhone = phone;
		      
	}
        
    

	public String getPassName() {
		return passName;
	}


	public void setPassName(String passName) {
		this.passName = passName;
	}


	public int getPassAge() {
		return passAge;
	}


	public void setPassAge(int passAge) {
		this.passAge = passAge;
	}


	public String getPasspoertNum() {
		return passpoertNum;
	}


	public void setPasspoertNum(String passpoertNum) {
		this.passpoertNum = passpoertNum;
	}


	public String getPassPhone() {
		return passPhone;
	}


	public void setPassPhone(String passPhone) {
		this.passPhone = passPhone;
	}
	
	
	
}
