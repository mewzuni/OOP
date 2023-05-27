public class FandangoYacht extends Vehicle {
    
    public FandangoYacht(int speed, String color, int price) {
        super(speed, color, price);
    }
    
    @Override
    public void stop() {
        System.out.println("Fandango Yacht stopped");
    }
}
