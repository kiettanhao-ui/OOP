import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Book {
    private String name, title;
    private double price;
    private int year;
    public Book(String name, String title, double price, int year)
    {
        this.name = name;
        this.title = title;
        this.price = price;
        this.year = year;
    }
}
