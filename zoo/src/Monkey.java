import junit.framework.TestCase;
public class Monkey extends AZooAnimal {
    private String food;
    public Monkey(InforAnimal info,String food)
    {
        super(info);
        this.food=food;
    }
}