public class VehicleInfo {
    public static void main(String[] args) {
        
        ToyotaVIOS toyotaVIOS = new ToyotaVIOS(106, "Brown", 1300000);
        U2SpyPlane u2SpyPlane = new U2SpyPlane(805, "Black", 268274400);
        FandangoYacht fandangoYacht = new FandangoYacht(18, "White", 5589050);
        
        toyotaVIOS.stop();
        u2SpyPlane.stop();
        fandangoYacht.stop();
    }
}
