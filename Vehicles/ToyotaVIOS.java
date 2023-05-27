public class ToyotaVIOS extends Vehicle {
    
    public ToyotaVIOS(int speed, String color, int price) {
        super(speed, color, price);
    }
    
    @Override
    public void stop() {
        System.out.println("Toyota-VIOS car stopped");
    }
}
