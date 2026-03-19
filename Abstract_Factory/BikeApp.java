package Abstract_Factory;

public class BikeApp {
    public static void main(String[] args) {
        BikeBuilder builder = new BikeBuilder();

        System.out.println("--- Build Mountain Bike ---");
        builder.buildBike(new MountainBikeFactory());

        System.out.println("\n--- Build Road Bike ---");
        builder.buildBike(new RoadBikeFactory());
    }
}
