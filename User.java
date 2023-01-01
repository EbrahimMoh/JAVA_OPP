/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem_2022;

/**
 *
 * @author End-User
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iman
 */
public class User {

    protected int age;
    protected String name;
    protected String icNo;
    protected String phoneNo;
    protected String email;
    protected String password;
    protected int gender;

    public User(String name, int age,  String icNo, int gender, String phoneNo, String email, String password) {
        this.age = age;
        this.name = name;
        this.name = name;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User(int age, String icNo, String phoneNo, String email, int gender) {
        this.age = age;
        this.name = name;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.email = email;
        this.gender = gender;
    }

    public User(){
        
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcNo() {
        return icNo;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Boolean validatePassword(String password) {

        return true;
    }
 /**
     */
    public void getUserNum() {
        for (int i=0; i>0; i++)
        {
            System.out.println("User No: " + i);
        }
        
    }
    public void logout() {

    }

   
}

