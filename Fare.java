class Fare{
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
}