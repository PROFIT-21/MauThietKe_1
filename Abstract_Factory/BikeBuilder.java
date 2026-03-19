package Abstract_Factory;

public class BikeBuilder {
    public void buildBike(BikeFactory factory) {
        Wheel wheel = factory.getWheel();
        System.out.println("Dang lap rap xe voi: " + wheel.getDescription());
    }
}