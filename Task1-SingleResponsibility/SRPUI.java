public class SRPUI
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Riad", 23, "B");
       
        SalaryCalculate pay = new SalaryCalculate();
        pay.calculateSalary(employee1);

        EmployeeReport report = new EmployeeReport();
        report.printReport("salaryReport", employee1);

    }
    
}
