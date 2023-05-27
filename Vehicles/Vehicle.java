public class Vehicle {
    int speed;
    String color;
    int price;
    
    public Vehicle(int speed, String color, int price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void stop() {
        System.out.println("Stop");
    }
}
