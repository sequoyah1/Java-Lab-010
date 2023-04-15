/**
 * Author Sequoyah Schaefer
 * Since 4/14/2023
 * Version 1.0
 */



public class CurrentConditions implements Display {
        private float temperature;
        private float humidity;
        private float pressure;
        private WeatherStation weatherStation;

        public CurrentConditions(WeatherStation weatherStation) {
            this.weatherStation = weatherStation;
            this.weatherStation.registerDisplay(this);
        }
        public void update(float temperature, float humidity, float pressure){
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
        }

        public void display() {
            System.out.println("Temperature=" + " " + temperature + " " + "F, Humidity=" + " " + humidity + " " + "%, Pressure=" + " " + pressure);
        }
    }
    public class StatisticsDisplay implements Display {
        private float temperatureMin;
        private float temperatureMax;
        private float temperatureSum;
        private int numReadings;
        public void display() {
            float averageTemperature = temperatureSum / numReadings;
            System.out.println("Min Temperature=" + " " +  temperatureMin + " " + "F, Max Temperature=" + " " + temperatureMax + " " + "F, Average Temperature=" + " " + averageTemperature + " " + "F");
        }
    }






public class ForecastDisplay implements Display {
    private float lastPressure;
    private float currentPressure;
    public void update(float temperature, float humidity, float pressure) {

    }
        public void display () {
            System.out.print("Forecast: ");
            if (currentPressure > lastPressure) {
                System.out.println("Improving weather on the way!");
            } else if (currentPressure == lastPressure) {
                System.out.println("More of the same");
            } else if (currentPressure < lastPressure) {
                System.out.println("Watch out for cooler, rainy weather");
            }
        }
    }
