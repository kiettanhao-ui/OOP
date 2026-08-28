import junit.framework.TestCase;
public class TestImage extends TestCase {
    public void testConstructor() {
        new Image(5, 10, "small.gif", "low");
        new Image(120, 200, "med.gif", "medium");
        new Image(1200, 1000, "large.gif", "high");
    }

    public void testIsPortrait(){
        assertFalse(new Image(5, 10, "small.gif", "low").isPortrait());
        assertFalse(new Image(120, 200, "med.gif", "medium").isPortrait());
        assertTrue(new Image(1200, 1000, "large.gif", "high").isPortrait());
    }

    public void testSize(){
        Image small=new Image(5, 10, "small.gif", "low");
        assertEquals(small.size(),50,0.1);
        Image medium=new Image(120, 200, "med.gif", "medium");
        assertEquals(medium.size(), 24000,0.1);
        Image large=new Image(1200, 1000, "large.gif", "high");
        assertEquals(large.size(), 1200000,0.1);
    }

    public void testIsLarger(){
        assertFalse(new Image(5, 10, "small.gif", "low").isLarger(new Image(120, 200, "med.gif", "medium")));
        assertFalse(new Image(5, 10, "small.gif", "low").isLarger(new Image(1200, 1000, "large.gif", "high")));
        assertFalse(new Image(120, 200, "med.gif", "medium").isLarger(new Image(1200, 1000, "large.gif", "high")));
    }
}
