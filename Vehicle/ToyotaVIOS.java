public class ToyotaVIOS extends Vehicle {
    
    public ToyotaVIOS(double speed, String color, double price) {
        super(speed, color, price);
    }
    
    @Override
    public void stop() {
        System.out.println("Toyota-VIOS car stopped");
    }
}
