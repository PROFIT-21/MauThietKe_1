package TheCommandPattern;

public class LightDimCommand implements Command {
    private Light light;
    private int prevLevel;
    private int newLevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.newLevel = level;
    }

    public void execute() {
        prevLevel = light.getBrightness();
        light.setBrightness(newLevel);
    }

    public void undo() {
        light.setBrightness(prevLevel);
    }
}
