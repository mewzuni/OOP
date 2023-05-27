public class U2SpyPlane extends Vehicle{
    
        public U2SpyPlane(int speed, String color, int price) {
            super(speed, color, price);
        }
        
        @Override
        public void stop() {
            System.out.println("U-2 Spy Plane stopped");
        }
    }
