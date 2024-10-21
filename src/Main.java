import java.util.ArrayList;
import java.util.List;

interface Device {
    void update(float temperature, float humidity, float pressure);
}

class WeatherStation {
    private List<Device> devices = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public void notifyDevices() {
        for (Device device : devices) {
            device.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyDevices();
    }
}

class SmartPhone implements Device {
    private String name;

    public SmartPhone(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println(name + " received weather update: " +
                "Temperature = " + temperature + "°C, " +
                "Humidity = " + humidity + "%, " +
                "Pressure = " + pressure + " hPa");
    }
}

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        SmartPhone phone1 = new SmartPhone("Phone 1");
        SmartPhone phone2 = new SmartPhone("Phone 2");

        weatherStation.addDevice(phone1);
        weatherStation.addDevice(phone2);

        weatherStation.setMeasurements(25.3f, 65.0f, 1013.1f);
    }
}