
// Flight Management


import java.util.*;

class Flight {
    String flightNumber, source, destination;
    String departureTime, arrivalTime;
    double ticketPrice;
    int availableSeats;

    Flight(String flightNumber, String source, String destination, String departureTime, String arrivalTime, double ticketPrice, int availableSeats) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
        this.availableSeats = availableSeats;
    }

    void display() {
        System.out.println("Flight Number: " + flightNumber + ", Source: " + source + ", Destination: " + destination + ", Departure: " + departureTime + ", Arrival: " + arrivalTime + ", Price: ₹" + ticketPrice + ", Seats: " + availableSeats);
    }
}

public class flightManagement {
    public static void main(String[] args) {
        Flight[] flights = {
            new Flight("AI202", "Bengaluru", "Delhi", "06:00", "09:00", 4500, 10),
            new Flight("AI203", "Bengaluru", "Mumbai", "07:30", "09:30", 3500, 5),
            new Flight("AI204", "Bengaluru", "Delhi", "08:00", "11:00", 5200, 8),
            new Flight("AI205", "Chennai", "Delhi", "05:00", "08:00", 4800, 12),
            new Flight("AI206", "Bengaluru", "Delhi", "05:30", "08:30", 4800, 0)
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of flight AI202");
            System.out.println("2. Display all flights from Bengaluru to Delhi with seats and price < ₹5000");
            System.out.println("3. Find and display the earliest departing flight from a given source");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean found = false;
                    for (Flight f : flights) {
                        if (f.flightNumber.equals("AI202")) {
                            f.display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Flight AI202 not found.");
                    break;

                case 2:
                    boolean foundFlights = false;
                    for (Flight f : flights) {
                        if (f.source.equals("Bengaluru") && f.destination.equals("Delhi") && f.availableSeats > 0 && f.ticketPrice < 5000) {
                            f.display();
                            foundFlights = true;
                        }
                    }
                    if (!foundFlights) System.out.println("No matching flights found.");
                    break;

                case 3:
                	System.out.print("Enter the source :");
                	sc.nextLine();
                	String source = sc.nextLine();
                    System.out.println(" ");
                	Flight earliestFlight=null;
                	
                	for(Flight f:flights) {
                		if(f.source.equals(source)) {
                			if(earliestFlight==null || f.departureTime.compareTo(earliestFlight.departureTime)<0) {
                				earliestFlight=f;
                			}
                		}
                	}
                	
                	if(earliestFlight!=null) {
                		 System.out.print("Earliest flight from " + source + " is: ");
                      
                		 earliestFlight.display();
                	}
                	else {
                		System.out.println("No flights from " + source);
                		 
                	}
                	 break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }
}

