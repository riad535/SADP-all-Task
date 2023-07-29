abstract public class Employee
{
    private int id;
    private String name;
    private String dep;
    private boolean working;

    public Employee(int id,String name,String dep,boolean working)
    {
        super();
        this.id = id;
        this.name = name;
        this.dep= dep;
        this.working = working;
    }

    public abstract void performDuties();

    public String toString()
    {
        return"Employee id : "+id+"Name : "+name+"Department : "+dep+"Working : "+working ;
    }
}