public class U2SpyPlane extends Vehicle{
    
        public U2SpyPlane(double speed, String color, double price) {
            super(speed, color, price);
        }
        
        @Override
        public void stop() {
            System.out.println("U-2 Spy Plane stopped");
        }
    }
