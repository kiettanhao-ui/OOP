import junit.framework.TestCase;
public class TestRestaurant extends TestCase {
    public void testConstructor(){
        Restaurant r1=new Restaurant("La Crepe","French food","Moderate",new Intersection("7th Ave ","65th Street"));
    }
}
