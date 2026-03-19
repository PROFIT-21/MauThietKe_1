package Builder;

public class Bedroom {
    private double size;
    private int windows;
    private String wallColor;
    private boolean hasEnsuite;
    private boolean hasBalcony;
    private String flooring;
    private String ceilingType;
    private String lightFixture;

    // Constructor nhận vào đối tượng Builder (Exercise 4a)
    protected Bedroom(double size, int windows, String wallColor, boolean hasEnsuite, 
                   boolean hasBalcony, String flooring, String ceilingType, String lightFixture) {
        this.size = size;
        this.windows = windows;
        this.wallColor = wallColor;
        this.hasEnsuite = hasEnsuite;
        this.hasBalcony = hasBalcony;
        this.flooring = flooring;
        this.ceilingType = ceilingType;
        this.lightFixture = lightFixture;
    }

    @Override
    public String toString() {
        return "Bedroom [Size=" + size + "sqm, Windows=" + windows + ", Color=" + wallColor + 
               ", Ensuite=" + hasEnsuite + ", Balcony=" + hasBalcony + "]";
    }
}