class Distance{
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
}