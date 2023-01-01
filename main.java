/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservationsystem_2022;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * 
 * @author yhtay
 */
public class main {

    /**
     * 
     */
    public static void main(String[] args) {
        
        int a = 0;

        do{
            boolean i ;
            int x = 0;

            ArrayList <Authentication> Registered_Passenger = new ArrayList<>();

            System.out.println("<<\n Welcome to Flight Reservation System >>");
            System.out.println(">> HomePage <<");
            System.out.println("<1> Register\t\t");
            System.out.println("<2> Login\t\t");
            System.out.println("<3> Exit\t\t");

            Scanner type = new Scanner(System.in);
            System.out.print("\nEnter <1> or <2> or <3>: ");
            int num = type.nextInt();
            while (num == 1){

                Authentication passenger = register();
                Registered_Passenger.add(passenger);
                break;
            } 
            if (num == 3)
            {
                System.exit(0);
            }
            
            do{
                
                 
                Boolean isSuccess = login(Registered_Passenger);
                if (isSuccess == true) {

                    Scanner scanner = new Scanner(System.in);

        //          To store flight that is available  for choosen from and to destination
                    ArrayList<Flight> listAvailableFlight = new ArrayList<>();
        //          Ask user to choose Date and Time
                    System.out.println("\n*******SUCCESSFUL LOGIN*******");
                    System.out.println("\nWhat is your departure place");
                    String origin = scanner.next();

                    System.out.println("\nWhat is your arrival place");
                    String destination = scanner.next();

                    Flight F = new Flight();

                    System.out.print("\nAirline Company: \n");
                    F.airline();
                    System.out.print("\nwhich Airline you want? : ");

                    int selectAirlinr = scanner.nextInt();
                    System.out.println("\t\n<< List of avalible trips >>");
                    F.timetable();

                    System.out.print("\nEnter number of trip : ");
                    int selection = scanner.nextInt();


                    System.out.println("\n<< Flight class >>\n1- Economy class +0RM\n2- First class +1000 RM\n3- Second class +500 RM\n4- Business class +2500 RM\n");
                    System.out.print("\nEnter which class u want: ");
                    int select_class = scanner.nextInt();
                    Flight flight_2 = new Flight(selection,selectAirlinr,origin,destination,select_class);
                    Ticket ticket = new Ticket(flight_2);

                    Flight E = new Flight();
                    Flight Fi = new First_class();
                    Flight S = new Second_class();

                    Flight B = new Business_class();
                    Ticket T = new Ticket();



                    System.out.print("\nHow many passengers u want to enter: ");
                    int numPassenger = scanner.nextInt();
                    Passenger[] passArray = new Passenger[numPassenger];
                    int o = 0;
                    for(int j = 0; j < numPassenger; j++)
                    {

                        o++;

                        System.out.println("\n*Passenger no " + o);
                        System.out.print("\nEnter passenger name :");
                        String passName = scanner.next();
                        System.out.print("Enter passenger age :");
                        int age = scanner.nextInt();

                        System.out.print("Enter passenger passport number : ");
                        String passportNum = scanner.next();
                        System.out.print("Enter passenger phone number: ");
                        String phone = scanner.next();

                        passArray [j] = new Passenger(passName,age,passportNum,phone, "", "", 0 , "", "", "");
                    }
                    Payment payment = new Payment();
                    Reservation reservation = new Reservation(numPassenger,ticket,payment);
                    reservation.conform();
                    int conform = scanner.nextInt();
                    switch(conform)
                    {
                        case 1:
                            reservation.paymentProcess(Registered_Passenger);
                            try {
                                    Thread.sleep(3000);
                            } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            System.out.println("The current balance is: " + reservation.getTotalPriceAfterPayment() +" RM");

                            try {
                                    Thread.sleep(4000);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                    e.printStackTrace();
                            }
                            break;
                        case 2:
                            reservation.feadbackCancel();
                            System.out.println("\nThank you for your feadback, have a nice day *****");

                            break;
                         default:
                            System.out.println("Try again -_-");
                            break;
                    }
                    if (conform == 1)
                    { 

                            System.out.println("\nThis is the overall of your ticket :");

                            System.out.println("========================================================================================================================\n");
                            ticket.purchaseDate();
                            for (int k =0 ; k < numPassenger ;k++)
                            { 
                                int l =0;
                                l++;
                                System.out.println( "Ticket ID: "+reservation.getReservation_ID() + "\nPassenger:" +l+"\nPassenger Name: " + passArray[k].getPassName() +"\nPassport number: " + passArray[k].getPasspoertNum());

                                switch(select_class) //polymorphism
                                {
                                    case 1: 
                                        //Abstraction & Interface
                                        E.economyClass();
                                        break;
                                    case 2:
                                        T.poly(Fi);
                                        break;
                                    case 3:
                                         T.poly(S);
                                        break;
                                    case 4:
                                          T.poly(B);
                                        break;	
                                }
                                System.out.println("luggag Weight: " + ticket.getLuggagWeight());
                                ticket.ticket();
                                System.out.println("========================================================================================================================\n");
                                try {
                                        Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                }
                            }

                    }

                    i = true;
                }
                else{

                    System.out.println("------------------------------------------------");
                    System.out.println("   Wrong name or password, please try again ");
                    System.out.println("------------------------------------------------");

                    i = false;
                    x++;
                }
                if (x > 3){
                    //you only have 3 time chances
                    System.out.println("\n???? Please try later ????");
                    break;
                }
            }while(i != true);
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n Continue to other application??? [Yes-1],[No-2]: ");
            a = scanner.nextInt();
        }while (a == 1);
        
        System.out.println("\t\t***** Thank you for using our system******");

    }      

    private static Authentication register() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n<< REGISTER >>");
        System.out.print("1. Name: ");
        String name = scanner.nextLine();

        System.out.print("\n2. Age: ");
        int age = scanner.nextInt();

        System.out.print("\n3. IC [xxxxxx-xx-xxxx]: ");
        String ic = scanner.next();

        System.out.print("\n4. Gender [1:Male , 2:Female]: ");
        int gender = scanner.nextInt();


        System.out.print("\n5. Phone Number: ");
        String phoneNo = scanner.next();


        System.out.print("\n6. Email: ");
        String email = scanner.next();

        System.out.print("\n7. Passport Number: ");
        String passportNo= scanner.next();

        System.out.print("\n8. *Password: ");
        String password = scanner.next();
        
        System.out.println("--------------------------------------------------------------------------------\n");


        return new Authentication(passportNo, name, age, ic , gender, phoneNo, email, password);

    }

    private static Boolean login(ArrayList<Authentication> Registered_Passenger) {

        System.out.println("\n\t<< LOGIN PAGE >>");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nUSERNAME *same with you name>> ");
        String name = scanner.nextLine();

        System.out.print("\nPASSWORD >> ");
        String password = scanner.next();

//        Looping
        for (int i = 0; i < Registered_Passenger.size(); i++) 
        {
            if (Registered_Passenger.get(i).name.equals(name) && Registered_Passenger.get(i).password.equals(password)) 
            {
                return true;
            }
        }
        return false;
    }
}
       
  
