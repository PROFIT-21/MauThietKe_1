package TheAdapterPattern;

public class FahrenheitAdapter implements TemperatureReporter {
    private FahrenheitSensor fahrenheitSensor;

    public FahrenheitAdapter(FahrenheitSensor sensor) {
        this.fahrenheitSensor = sensor;
    }

    @Override
    public double getTemperature() {
        double f = fahrenheitSensor.getFahrenheitTemp();
        return (f - 32) * 5 / 9;
    }
}