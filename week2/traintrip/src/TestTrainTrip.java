import junit.framework.TestCase;

import java.sql.Time;
import java.time.Clock;

public class TestTrainTrip extends TestCase{
    public void testConstructor(){
        Route r = new Route("New York", "Boston");
        ClockTime d = new ClockTime(23, 50);
        ClockTime a = new ClockTime(13, 20);
        Schedule s = new Schedule(d, a);
        TrainTrip t1 = new TrainTrip(r, s, new KindOfTrain("fast",20,3.00));

        r = new Route("Chicago", "New York");
        d = new ClockTime(10, 34);
        a = new ClockTime(13, 18);
        s = new Schedule(d, a);
        TrainTrip t2 = new TrainTrip(r, s, new KindOfTrain("fast",20,3.00));
    }
}
