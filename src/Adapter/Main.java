package Adapter;

public class Main {
    public static void main(String[] args) {
        LegacyWeatherSensor sensor = new LegacyWeatherSensor();
        SensorAdapter adapter = new SensorAdapter(sensor);

        System.out.println("Sensor temperature is: " + adapter.getTemperatureCelsius() + "℃");
    }
}
