package annotaitonTraining;

// We removed the "jakarta.persistence" imports because you don't have that library.

public class WeatherData {

    private String city;
    private double temperature;
    
    // @Deprecated is a standard Java annotation.
    // It tells other programmers: "Don't use this field, it might be removed soon."
    @Deprecated 
    private String oldDescriptionFormat; 

    public WeatherData(String city, double temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    // @Override is a standard Marker annotation.
    // It guarantees we are correctly updating the standard toString() method.
    @Override 
    public String toString() {
        return "Weather in " + city + ": " + temperature + "C";
    }
}