public class CreditCard implements IPayment
{
    public void payment()
    {
        System.out.println("Payment by CreditCard");
    }

    public void amount(double a)
    {
        System.out.println("Amount : "+a);
    }
    
}
