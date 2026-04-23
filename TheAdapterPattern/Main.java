package TheAdapterPattern;

public class Main {
    public static void main(String[] args) {
        
        TemperatureReporter localSensor = new CelsiusSensor(25.0);
        System.out.println("Local Sensor: " + localSensor.getTemperature() + "°C");

       
        FahrenheitSensor usSensor = new FahrenheitSensor(98.6);
        
        TemperatureReporter adaptedSensor = new FahrenheitAdapter(usSensor);

        System.out.println("US Sensor (via Adapter): " + adaptedSensor.getTemperature() + "°C");
    }
}
