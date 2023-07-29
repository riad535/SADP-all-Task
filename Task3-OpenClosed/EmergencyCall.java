public class EmergencyCall
{
    public static void main(String[] args)
    {
        HospitalManagement caller = new HospitalManagement();

        Employee peggy = new Nurse(1,"Peggy","emergency",true);
        caller.call(peggy);

        Employee tom = new Doctor(2,"Suzon","emergency",true);
        caller.call(tom);
    }
}