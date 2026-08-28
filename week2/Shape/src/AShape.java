import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public abstract class AShape {
    protected CartesianPoint location;
    protected AShape(CartesianPoint location)
    {
        this.location=location;
    }
}
