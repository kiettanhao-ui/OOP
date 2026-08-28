import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Square extends AShape {
    private int side;
    public Square(CartesianPoint location, int side) {
        super(location);
        this.side = side;
    }
}