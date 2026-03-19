package Abstract_Factory;

public class RoadBikeFactory implements BikeFactory {
    public Wheel getWheel() {
        return new RoadBikeWheel();
    }
}