public class Contex
{
    private IPayment strategy;

    public Contex(IPayment strategy)
    {
        this.strategy= strategy;
    }

    public void paymentSystem()
    {
        strategy.payment();
        
    }

    public void amount(double a)
    {
        strategy.amount(a);
    }
    
}