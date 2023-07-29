public class Nurse extends Employee
{
    public Nurse(int id,String name,String dep,boolean working)
    {
        super(id, name, dep, working);
        System.out.println("Nurse in action>>>");
    }

    private void checkVitalSigns()
    {
        System.out.println("Checking Vitals");
    }
    
    private void checkBloodPressure()
    {
        System.out.println("Checking Blood Pressure");
    }

    private void cleanPatientArea()
    {
        System.out.println("Cleaning Patient Area");
    }

    @Override
    public void performDuties() 
    {
        checkVitalSigns();
        checkBloodPressure();
        cleanPatientArea();
    }
}
