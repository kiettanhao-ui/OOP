import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class Schedule {
    private ClockTime departure;
    private ClockTime arrival;
    public Schedule(ClockTime departure,ClockTime arrival)
    {
        this.departure=departure;
        this.arrival=arrival;
    }
}
