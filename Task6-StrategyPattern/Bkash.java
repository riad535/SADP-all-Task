public class Bkash implements IPayment
{

    public void payment()
    {
        System.out.println("Payment by bKash");
    }
    
    public void amount(double a)
    {
        System.out.println("Amount : "+a);
    }
    
}
