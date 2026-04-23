package TheBridgePattern;

public class Square extends Shape {
	public Square(Color color ) {
		super(color);
	}
	@Override
	public void draw() {
		System.out.println("Drawing a Square filled with " + color.applyColor() + "color");
	}
}
