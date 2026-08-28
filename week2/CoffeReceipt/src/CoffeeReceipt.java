import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class CoffeeReceipt {
    private String kind;
    private double weight;
    private double pricePerPound;

    public CoffeeReceipt(String kind, double pricePerPound, double weight) {
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }
    //to compute the total cost of this coffee purchase [in cents]
    public double sellingCost(){
        double sum= this.pricePerPound*this.weight;
        if(sum>=2000)
        {
            return sum*0.75;
        }else if (sum< 20000 && sum>=5000)
        {
            return sum*0.9;
        }else return sum;
    }

    public boolean weighsMore(double amount){
        return this.weight>amount;
    }

    public boolean isCheaperThan(CoffeeReceipt that)
    {
        return this.pricePerPound<that.pricePerPound;
    }

    public boolean costsLessThan(CoffeeReceipt that)
    {
        return this.sellingCost()<that.sellingCost();
    }
}