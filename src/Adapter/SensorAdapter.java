package Adapter;

public class SensorAdapter implements WeatherProvider {
    private LegacyWeatherSensor sensor;

    public SensorAdapter(LegacyWeatherSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperatureCelsius() {
        return (sensor.getTempFahrenheit() - 32) * 5/9;
    }
}
