package com.company;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("123", "Pune" , "Mumbai" , "DepartureDateTime" , "ArrivalDateTime" ,
                "7H", 4000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("567", "India", "USA","DepartureDateTime", "ArrivalDateTIme",
                "5B", 13000, false, null, null,"Quber Hotel", new String[]{""});


        printTicketDetails(regularTicket);

        printTicketDetails(touristTicket);

    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
