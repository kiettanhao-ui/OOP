import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Restaurant {
    private String name;
    private String food;
    private String priceRange;
    private Intersection intersection;

    public Restaurant(String name, String food, String priceRange,Intersection intersection)
    {
        this.name=name;
        this.food=food;
        this.priceRange=priceRange;
        this.intersection=intersection;
    }
}
