import junit.framework.TestCase;
public class TestWeatherRecord extends TestCase {
    public void testConstructor(){
        new WeatherRecord(new Date(3,12,2006),new TemperatureRange(100,99),new TemperatureRange(98,97),new TemperatureRange(96,95),99.99);
    }
}
