//inherite Car super class

public class RacingCar extends Car
{
    public int weight;

    public RacingCar(String color,int speed,int weight)
    {
        super(color, speed);
        this.weight = weight;
    }
    
    @Override
    public int gear(int increment)
    {
        return super.gear(increment);
    }

    @Override
    public int brake(int decrement) 
    {
        return super.brake(decrement);
    }
     
    //override toString method
    public String toString()
    {
        return(super.toString() + "\nWeight of the car is "+weight);
    }
    
}
