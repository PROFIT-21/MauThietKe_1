package TheBridgePattern;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}
	@Override
	public void draw() {
	    System.out.println("Drawing a Circle filled with " + color.applyColor() + " color.");
	}
}
