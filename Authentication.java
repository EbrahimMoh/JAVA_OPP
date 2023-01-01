/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem_2022;

/**
 *
 * @author End-User

 * 
 */
public class Authentication extends User {
    
   
    private String passportNo;
    private String username;
    
    public Authentication(String passportNo, String name, int age, String ic , int gender, String phoneNo, String email, String password){
        
        super(name, age, ic, gender, phoneNo, email, password);
        this.passportNo = passportNo;
        this.password = password;
        this.username  = name;
    }
    
    public Authentication(){
        
        
    }

 
    
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getpassportNo()
    {
        return passportNo;
    }
    public void setpassportNo(String passportNo)
    {
        this.passportNo = passportNo;
    }
    
    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age = age;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getUsername(){
        return username;
    }
   
}

