import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public boolean earlierThan(Date that) {
        if (this.year < that.year) return true;
        if (this.year > that.year) return false;

        if (this.month < that.month) return true;
        if (this.month > that.month) return false;

        return this.day<that.day;
    }
}
