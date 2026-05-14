package TheCommandPattern;

public class Light {
    private int brightness = 0;
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println("Light brightness set to: " + level + "%");
    }
    public int getBrightness() { return brightness; }
}
