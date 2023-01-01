/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinereservationsystem_2022;

/**
 *
 * 
 */
// Subclass (inherit from Economy Class)
public class Flight extends Economy_class{

    
    private int flightNum [] = {102,103,104,105};
    private String airlineName [] = {"AirAsia","Malaysia Airlines","Qatar Airways","Singapore Airlines"};
    private String origin;
    private String  destination  ;
    private String departTime [] = {"12:00pm","02:20pm","08:30pm", "06:00pm", "10:15pm"};
    private String departDate [] = {"01-12-2022","03-12-2022","06-12-2022","08-12-2022", "17-12-2022"};
    private String arriveTime [] = {"07:00pm", "10:20pm","01:30am","10:00pm","02:00am"};
    private String arriveDate [] = {"01-12-2022","03-12-2022","07-12-2022","08-12-2022","18-12-2022"};
    private int capacity[] = {150,100,25,36,10};
    private double price[] = {1000,1200,1900,1500,2000};
    private String gate[] = {"A","B","C","D","E"};
    private int selectionTrip;
    private int selectAirline;
    private int select_class;
	

    public Flight()
    {

    }

    public Flight (int selection,int selectAirline,String origin,String destination, int select_class)
    {
            this.selectionTrip = selection;
            this.selectAirline = selectAirline;
            this.origin = origin;
            this.destination = destination;
            this.select_class = select_class;
    }


    public int getFlightNum() {
            return flightNum[selectionTrip-1];
    }


    public void setFlightNum(int[] flightNum) {
            this.flightNum = flightNum;
    }


    public String getAirlineName() {
            return airlineName[selectAirline-1];
    }


    public void setAirlineName(String[] airlineName) {
            this.airlineName = airlineName;
    }


    public String getOrigin() {
            return origin;
    }


    public void setOrigin(String origin) {
            this.origin = origin;
    }





    public String getDestination() {
            return destination;
    }


    public void setDestination(String destination) {
            this.destination = destination;
    }


    public String getDepartTime() {
            return departTime[selectionTrip-1];
    }


    public void setDepartTime(String[] departTime) {
            this.departTime = departTime;
    }


    public String getDepartDate() {
            return departDate[selectionTrip-1];
    }


    public void setDepartDate(String[] departDate) {
            this.departDate = departDate;
    }


    public String getArriveTime() {
            return arriveTime[selectionTrip-1];
    }


    public void setArriveTime(String[] arriveTime) {
            this.arriveTime = arriveTime;
    }


    public String getArriveDate() {
            return arriveDate[selectionTrip-1];
    }


    public void setArriveDate(String[] arriveDate) {
            this.arriveDate = arriveDate;
    }


    public int getCapacity() {
            return capacity[selectionTrip-1];
    }


    public void setCapacity(int[] capacity) {
            this.capacity = capacity;
    }


    public double getPrice() {
            return price[selectionTrip -1];
    }


    public void setPrice(double[] price) {
            this.price = price;
    }


    public String getGate() {
            return gate[selectionTrip-1];
    }


    public void setGate(String[] gate) {
            this.gate = gate;
    }

    public void flight_class()
    {
            System.out.println("Class: Economy Class");
    }

    public void timetable()
    {
            int j= 0;

            System.out.println("\n  DepartDate   DepartTime  ArriveDate  ArriveTime  Price  capacity");
            for( j = 0; j <5; j++)
            {

                    System.out.println(j+1 + "-  " + departDate[j] + "   " + departTime[j] + "     " + arriveDate[j] + "  " +  arriveTime[j] +"   " + price[j]+" RM" + "  " + capacity[j]);

            }

    }
    public void airline()
    {
        int j=0;
        for( j = 0;j < 4;j++)
        {
           
            System.out.println(j+1+ "- " + airlineName[j]);	
        }
    }

    public double classPrice()
    {
            double classPrice = 0;

            if (select_class == 1)
            {
                    classPrice = 0 ;
            }
            else if (select_class == 2)
            {
                    classPrice = 1000;
            }
            else if (select_class == 3)
            {
                    classPrice = 500;
            }
            else if (select_class == 4)
            {
                    classPrice = 2500;

            }
            return classPrice;
    }

    public void economyClass(){
            System.out.println("Class: Economy Class");

    }
}	
