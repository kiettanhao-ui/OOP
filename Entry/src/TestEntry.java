import junit.framework.TestCase;
public class TestEntry extends TestCase {
    public void testConstructor(){
        Date d1=new Date(5,6,2003);
        Entry e1=new Entry(d1,5.3,27,"Good");

        Date d2=new Date(6,6,2003);
        Entry e2=new Entry(d2,2.8,24,"Tired");

        Date d3=new Date(23,6,2003);
        Entry e3=new Entry(d3,26.2,150,"Exhausted");
    }
    public void testPace() {
        Entry entry = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
        assertEquals(entry.pace(), 5.094, 0.001);
        entry = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
        assertEquals(entry.pace(), 8.571, 0.001);
        entry = new Entry(new Date(23, 6, 2004), 26.2, 159, "exhausted");
        assertEquals(entry.pace(), 6.069, 0.001);
    }

    public void testIsEarlierThan() {
        Date date1 = new Date(30, 6, 2003);
        Date date2 = new Date(1, 1, 2004);
        Date date3 = new Date(1, 12, 2004);
        Date date4 = new Date(15, 12, 2004);
        Date date5 = new Date(31, 12, 2004);
        assertTrue(date1.earlierThan(date2));
        assertTrue(date2.earlierThan(date3));
        assertTrue(date3.earlierThan(date4));
        assertTrue(date4.earlierThan(date5));
        assertFalse(date1.earlierThan(date1));
        assertFalse(date5.earlierThan(date4));
        assertFalse(date4.earlierThan(date3));
        assertFalse(date3.earlierThan(date2));
        assertFalse(date2.earlierThan(date1));
    }
}
