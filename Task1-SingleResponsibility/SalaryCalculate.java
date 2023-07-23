public class SalaryCalculate 
{
    public double calculateSalary(Employee employee)
    {
        String grade = employee.getGrade();
        double salary = 0.0;

        if(grade == "A")
        {
            salary = 30 * 1000;
        }

        else if(grade == "B")
        {
            salary = 30 * 800;
        }

        else if(grade == "c")
        {
            salary = 30 * 500;
        }

        System.out.println("Salary for is grade>>> "+salary);
        return salary;
    }
    
}
