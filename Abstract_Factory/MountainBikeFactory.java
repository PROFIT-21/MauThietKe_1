package Abstract_Factory;

public class MountainBikeFactory implements BikeFactory {
	public Wheel getWheel() {
        return new MountainBikeWheel();
    }
}