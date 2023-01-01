/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem_2022;

/**
 *
 * 
 */
public class Ticket {
   
    private String ticket;

    private double luggagWeight = 30;
    private Passenger passenger;
    private Flight flight ;
	
    public Ticket()
    {
    	
    }

    public Ticket(Flight flight_2)
    {
        this.flight = flight_2;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }


    public double getLuggagWeight() {
        return luggagWeight;
    }

    public void setLuggagWeight(double luggagWeight) {
        this.luggagWeight = luggagWeight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double totalTicketPrice()
    {
        double totalPrice;
        totalPrice =  flight.getPrice() + flight.classPrice();

        return totalPrice;
    }

    public void purchaseDate()
    {
        System.out.println("Apply Date: " +java.time.LocalDate.now() + "  " + java.time.LocalTime.now());
    }

    public double selecFlight()
    {
        return flight.getPrice();
    }

    public void poly(Flight value) // polymorphism
    {
        value.flight_class();
    }
    public void ticket()
    {

        System.out.println("Airline company: " + flight.getAirlineName() + "\nFlight no: " + flight.getFlightNum() + "\nForm: " + flight.getOrigin() + "\nTo: " + flight.getDestination() + "\nDepartDate: " + flight.getDepartDate() + "\nDepart Time " + flight.getDepartTime() + "\nArrive Date: " + flight.getArriveDate() + "\nArrive Time: " + flight.getArriveTime() + "\n ");
    }
}

