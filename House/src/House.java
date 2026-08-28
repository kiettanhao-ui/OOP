import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class House {
    private String Kinds;
    private int NumOfRooms;
    private Address address;
    private double Price;

    public House(String Kinds, int NumsOfRooms, Address address, double Price){
        this.Kinds=Kinds;
        this.NumOfRooms=NumsOfRooms;
        this.address=address;
        this.Price=Price;
    }

    public boolean hasMoreRooms(House That){
        return this.NumOfRooms>That.NumOfRooms;
    }

    public boolean inThisCity(String City){
        return this.address.getCity().equals(City);
    }

    public boolean sameCity(House that){
        return this.address.getCity().equals(that.address.getCity());
    }
}

