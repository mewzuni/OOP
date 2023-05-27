public class FandangoYacht extends Vehicle {
    
    public FandangoYacht(double speed, String color, double price) {
        super(speed, color, price);
    }
    
    @Override
    public void stop() {
        System.out.println("Fandango Yacht stopped");
    }
}

