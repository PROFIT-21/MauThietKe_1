package TheDecoratorPattern;

public class CanvasApp {
    public static void main(String[] args) {
        Shape normalCircle = new Circle();
        
        Shape redBorderCircle = new RedBorderDecorator(new Circle());

        System.out.println("Drawing normal circle:");
        normalCircle.draw();

        System.out.println("\nDrawing circle with red border:");
        redBorderCircle.draw();
    }
}
