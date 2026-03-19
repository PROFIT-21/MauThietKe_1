package Factory_Method;

public class CandyFactory {
	public Candy getCandy(String type) {
        if (type.equalsIgnoreCase("hard")) {
            return new HardCandy();
        } else if (type.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        } else {
            return null; 
        }
    }
}
