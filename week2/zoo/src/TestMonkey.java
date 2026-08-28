import junit.framework.TestCase;
public class TestMonkey extends TestCase {
    public void testConstructor() {
        new Monkey(new InforAnimal("George",150),"Bananas");
        new Monkey(new InforAnimal("Mina",120),"Kiwi");
    }
}