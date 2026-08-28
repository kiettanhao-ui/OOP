import junit.framework.TestCase;
public class TestHouse extends TestCase {
    public void testConstructor(){
        new House("Ranch", 7, new Address("23","Maple Street","Brookline"), 375.000);
        new House("Colonial", 9, new Address("5","Joye Road","Newton"), 450.000);
        new House("Cape", 6, new Address("83","Winslow Road","Waltham"), 235.000);
    }
    public void testHasMoreRooms(){
        House house1 = new House("Ranch", 7,
                new Address("23", "Mapple Street", "Brooklyn"), 375000);
        House house2 = new House("Colonial", 9,
                new Address("5", "Jove Road", "Newton"), 450000);
        House house3 = new House("Cape", 6,
                new Address("83", "Winslow Road", "Waltham"), 235000);
        assertFalse(house1.hasMoreRooms(house2));
        assertTrue(house2.hasMoreRooms(house3));
    }

    public void testThisCity(){
        House house1 = new House("Ranch", 7,
                new Address("23", "Mapple Street", "Brooklyn"), 375000);
        House house2 = new House("Colonial", 9,
                new Address("5", "Jove Road", "Newton"), 450000);
        House house3 = new House("Cape", 6,
                new Address("83", "Winslow Road", "Waltham"), 235000);
        assertTrue(house1.inThisCity("Brooklyn"));
        assertFalse(house1.inThisCity("Newton"));
    }

    public void testSameCity() {
        House house1 = new House("Ranch", 7,
                new Address("23", "Mapple Street", "Brooklyn"), 375000);
        House house2 = new House("Colonial", 9,
                new Address("5", "Jove Road", "Newton"), 450000);
        House house3 = new House("Cape", 6,
                new Address("83", "Winslow Road", "Waltham"), 235000);
        assertTrue(house1.sameCity(house1));
        assertFalse(house1.sameCity(house2));
    }
}
