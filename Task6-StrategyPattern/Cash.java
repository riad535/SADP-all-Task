public class Cash implements IPayment
{
    public void payment()
    {
        System.out.println("Payment by Cash");
    }
    
    public void amount(double a)
    {
        System.out.println("Amount : "+a);
    }
}
