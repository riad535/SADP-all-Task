public class Car
{
    //access modifier && variable declaration
    public String color;
    public int speed;

    //constractor
    public Car(String color,int speed)
    {
        this.color = color;
        this.speed = speed;
    }
     

    //method with parameter
    public int brake(int decrement)
    {
        return speed -= decrement;
    }

    //method with parameter
    public int gear(int increment)
    {
        return speed += increment;
    }

    public String toString()
    {
        return ("Color of the car is " + color+"\n"+"speed of car is "+speed);
    }

}
