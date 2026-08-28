import junit.framework.TestCase;
public class TestSnake extends TestCase {
    public void testConstructor() {
        new Snake(new InforAnimal("Boa",50),5);
    }
}