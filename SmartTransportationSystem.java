// Below is a single-file legacy Java program for a Smart Transportation Management System. It intentionally contains:

// Poor variable names
// Poor method names
// Long methods
// Duplicate code
// Mixed responsibilities
// Temporary variables
// Unclear naming
// Methods that should be extracted
// Methods and variables that should be renamed
// Logic that should be moved to separate classes

// The students' task is to apply Extract Method, Move Method, Rename Variable, and Rename Method refactorings

public class SmartTransportationSystem {

    public static void main(String[] args) {

        SmartTransportationSystem system = new SmartTransportationSystem();

        system.details("Ali", "BUS", 120, "CARD",345.0);
        system.details("Ahmed", "TAXI", 30, "CASH",670.0);
        system.details("Sara", "TRAIN", 250, "ONLINE",456.0);
        system.totaldistance("Ahmed","BUS",23,"CARD");
        system.paymentDetails("Zara", "TRAIN", 250, "ONLINE");
        system.faredetails(230.0,23.0,"AMNA");
    }
    public void totaldistance(String name, String type, int distance, String payment){
           double totalDistance = 0;
        

        if (type.equals("BUS")) {
            totalDistance = distance * 2;
        }
        else if (type.equals("TAXI")) {
            totalDistance = distance * 8;
        }
        else if (type.equals("TRAIN")) {
            totalDistance = distance * 4;
        }
        else {
            System.out.println("Invalid Vehicle");
            return;
        }
        
    }
    public void faredetails(double totalDistance, double distance , String name){
        System.out.println("Base Fare: " + totalDistance);
        double tax = 0;
        if (distance > 100) {
            tax = totalDistance * 0.10;
        }
        else {
            tax = totalDistance * 0.05;
        }
                System.out.println("Tax: " + tax);
          double totalAmount = totalDistance + tax;
        
        if (name.equalsIgnoreCase("Ali")) {
            totalAmount = totalAmount - (totalAmount * 0.15);
            System.out.println("Special Discount Applied");
        }
        
          System.out.println("Final Fare: " + totalAmount);
    }
    public void paymentDetails(String name, String type, int distance, String payment){
        if (payment.equals("CARD")) {

            System.out.println("Processing Card Payment...");
            System.out.println("Verifying Card...");
            System.out.println("Deducting Amount...");
            System.out.println("Payment Successful");
        }
        else if (payment.equals("CASH")) {

            System.out.println("Receiving Cash...");
            System.out.println("Generating Receipt...");
            System.out.println("Payment Successful");
        }
        else if (payment.equals("ONLINE")) {

            System.out.println("Connecting Gateway...");
            System.out.println("Verifying Transaction...");
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Invalid Payment Method");
            return;
        }
    }
    public void details(String name, String type, int distance, String payment, double totaldistance) {

        System.out.println("================================");
        System.out.println("Passenger Name: " + name);
        System.out.println("Vehicle Type: " + type);
        System.out.println("Distance: " + distance);

        System.out.println("Sending SMS Notification...");
        System.out.println("Passenger " + name + ", your booking has been confirmed.");

        System.out.println("Saving Booking Record...");
        System.out.println("Passenger: " + name);
        System.out.println("Vehicle: " + type);
        System.out.println("Distance: " + distance);
        System.out.println("Amount Paid: " + totaldistance);

        System.out.println("================================");
    }
}