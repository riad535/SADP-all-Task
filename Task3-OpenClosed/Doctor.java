public class Doctor extends Employee 
{
    public Doctor(int id,String name,String dep,boolean working)
    {
        super(id, name, dep, working);
        System.out.println("Doctor in action>>>");
    }


    private void prescribeMedicine()
    {
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients()
    {
        System.out.println("Diagnosing Patient");
    }


    @Override
    public void performDuties() 
    {
        prescribeMedicine();
        diagnosePatients();
    }
    
}
