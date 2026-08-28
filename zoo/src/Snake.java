import junit.framework.TestCase;
public class Snake extends AZooAnimal {
    private int length;
    public Snake(InforAnimal info,int length)
    {
        super(info);
        this.length=length;
    }
}
