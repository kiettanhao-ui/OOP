import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class TrainTrip {
    private Route route;
    private Schedule schedule;
    private KindOfTrain kindOfTrain;
    public TrainTrip(Route route,Schedule schedule, KindOfTrain kindOfTrain)
    {
        this.route=route;
        this.schedule=schedule;
        this.kindOfTrain=kindOfTrain;
    }
}
