package TheAdapterPattern;

public class CelsiusSensor implements TemperatureReporter {
    private double temperature;

    public CelsiusSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature; 
    }
}
