class Main_2{
public static void main(String[] args) {

        SmartTransportationSystem system = new SmartTransportationSystem();

        system.details("Ali", "BUS", 120, "CARD",345.0);
        system.details("Ahmed", "TAXI", 30, "CASH",670.0);
        system.details("Sara", "TRAIN", 250, "ONLINE",456.0);
        system.totaldistance("Ahmed","BUS",23,"CARD");
        system.paymentDetails("Zara", "TRAIN", 250, "ONLINE");
        system.faredetails(230.0,23.0,"AMNA");
    }
}