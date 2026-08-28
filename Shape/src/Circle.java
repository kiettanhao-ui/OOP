import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Circle extends AShape {
    private int radius;
    public Circle(CartesianPoint location, int radius) {
        super(location);
        this.radius = radius;
    }
}

