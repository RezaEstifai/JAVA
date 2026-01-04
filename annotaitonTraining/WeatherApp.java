package annotaitonTraining;

import java.lang.reflect.Method; // Library needed to "read" annotations

public class WeatherApp {

    // 1. We apply our CUSTOM annotation here
    // This tells our app: "Cache this data for 500 seconds"
    @RefreshRate(value = 500)
    public void updateWeather() {
        System.out.println("Fetching new weather data...");
    }

    public static void main(String[] args) {
        System.out.println("--- Starting Weather App ---");

        WeatherData data = new WeatherData("Turin", 25.5);
        System.out.println(data.toString());

        // 2. This is the "Magic" Part: Reading the annotation at runtime
        try {
            // Get the class
            Class<?> cls = WeatherApp.class;
            
            // Get the method named "updateWeather"
            Method method = cls.getMethod("updateWeather");

            // Check if our annotation is present
            if (method.isAnnotationPresent(RefreshRate.class)) {
                
                // Get the actual annotation
                RefreshRate annotation = method.getAnnotation(RefreshRate.class);
                
                // Read the value inside it
                int seconds = annotation.value();
                
                System.out.println("Found @RefreshRate annotation!");
                System.out.println("Cache duration set to: " + seconds + " seconds.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}