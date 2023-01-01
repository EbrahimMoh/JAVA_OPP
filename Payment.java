/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem_2022;

/**
 *
 * @author End-User
 */
/**
 * 
 * 
 */

import java.time.LocalDateTime;
import java.util.Random;
/**
 *
 * @author Acer
 */
 public class Payment {
    private int receiptNo;
    private double currentBalance = 200000;
    private String bankAcc ="2665863659825";
    LocalDateTime date;
    private boolean status;
    private String usernmae = "bcs2143";
    private String password = "bcs2143";
    
    public int getReceiptNo() {
        Random rand = new Random();
        int upperbound = 35201;
        receiptNo = rand.nextInt(upperbound);
        
        return receiptNo;
    }

    public void setReceiptNo(int receiptNo) {
        this.receiptNo = receiptNo;
    }

    public double getCurrentBalance() {
            return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
            this.currentBalance = currentBalance;
    }

    public String getBankAcc() {
            return bankAcc;
    }

    public void setBankAcc(String bankAcc) {
            this.bankAcc = bankAcc;
    }

    public LocalDateTime getDate() {
            return date;
    }

    public void setDate(LocalDateTime date) {
            this.date = date;
    }

    public boolean isStatus() {
            return status;
    }

    public void setStatus(boolean status) {
            this.status = status;
    }

    public String getUsernmae() {
            return usernmae;
    }

    public void setUsernmae(String usernmae) {
            this.usernmae = usernmae;
    }

    public String getPassword() {
            return password;
    }

    public void setPassword(String password) {
            this.password = password;
    }
}      
        
    
    
    


