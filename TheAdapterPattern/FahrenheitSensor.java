package TheAdapterPattern;

public class FahrenheitSensor {
    private double fahrenheitTemp;

    public FahrenheitSensor(double fahrenheitTemp) {
        this.fahrenheitTemp = fahrenheitTemp;
    }

    public double getFahrenheitTemp() {
        return fahrenheitTemp;
    }
}