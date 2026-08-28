import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Address {
    private String houseNumbers;
    private String Street;
    private String City;

    public Address(String houseNumbers,String Street, String City) {
        this.houseNumbers=houseNumbers;
        this.Street=Street;
        this.City=City;
    }

    public String getCity() {
        return this.City;
    }
}
