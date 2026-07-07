 class Details{
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