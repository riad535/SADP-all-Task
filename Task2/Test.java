public class Test
{
    public static void main(String[] args)
    {
        //Object create
        RacingCar rc = new RacingCar("Black", 100, 250);
        rc.gear(45);

        System.out.println(rc.toString());
    }
    
}
