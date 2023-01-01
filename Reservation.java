/*
 * 
 * 
 */
package airlinereservationsystem_2022;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Reservation {
    
    private int reservation_ID;
    private String reason;
    private Ticket ticket;
    private Payment payment;
    private int numPassenger;
    private double totalPriceAfterPayment = 0;
    
    public Reservation(int numPassenger , Ticket ticket, Payment payment)
    {
    	this.numPassenger = numPassenger;
    	this.ticket = ticket;
    	this.payment = payment;
    }
    
    public Reservation (){
        
    }
    
    public int getReservation_ID(){
        
    	Random rand = new Random();
    	int upperbound = 25550;
    	reservation_ID = rand.nextInt(upperbound);
	return reservation_ID;
        
    }

	

    public String getReason() {

            return reason;
    }

    public void setReason(String reason) {
        
            this.reason = reason;
            
    }

    public Payment getPayment() {
        
            return payment;
            
    }

    public void setPayment(Payment payment) {
            this.payment = payment;
    }

    public Ticket getTicket() {
            return ticket;
    }



    public void setTicket(Ticket ticket) {
            this.ticket = ticket;
    }



    public int getNumPassenger() {
            return numPassenger;
    }



    public void setNumPassenger(int numPassenger) {
            this.numPassenger = numPassenger;
    }



    public void setReservation_ID(int reservation_ID) {
            this.reservation_ID = reservation_ID;
    }

    public double getTotalPriceAfterPayment() {

            return totalPriceAfterPayment;

    }


    public void setTotalPriceAfterPayment(double totalPriceAfterPayment) {

            this.totalPriceAfterPayment = totalPriceAfterPayment;

    }



    public double paymentProcess(ArrayList<Authentication> verify)
    {
    	Scanner input = new Scanner(System.in);
    	String password;
    	String usernmae;
    	double totalPrice = ticket.totalTicketPrice() * numPassenger ;
     	System.out.println("\t*****Welcome to the payment page*******");
     	try {
    		Thread.sleep(2000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	System.out.println("Enter your usernmae: ");
    	usernmae = input.next();
    	System.out.println("Enter your password: ");
    	password = input.next();
    	
    	if (usernmae.equals(payment.getUsernmae()) && password.equals(payment.getPassword())) //usernmae and password is "bcs2143"
    	{
    		System.out.println("Login successfully \n");
    		try {
    			Thread.sleep(3000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		System.out.println("Receipt no: " + payment.getReceiptNo());
    		System.out.println("Your account number is: " + payment.getBankAcc());
    		totalPriceAfterPayment = payment.getCurrentBalance() - totalPrice ;
    		System.out.println("Your account has been debited: " + totalPrice +" RM");
    		return totalPriceAfterPayment;
    	}
    	
    	else 
    	{
    		System.out.println("Try again -_-\n");
    		System.exit(0);
    	}
        return totalPriceAfterPayment;

    }
    
    public String feadbackCancel()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nDear customer, could you give us your feadback, why you want to cancel the trip");
        System.out.print("\nReply : ");
        reason = input.nextLine();
        return reason;
    }
    
    public void conform()
    {

        System.out.println("\nThe total price will be : " + "RM " + ticket.totalTicketPrice() * numPassenger);
        System.out.println("**Are you sure for conform this ticket: Yes<1>, NO<2>");

    }
   
}