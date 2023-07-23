public class EmployeeReport 
{
    public void printReport(String reportType,Employee employee)
    {
        String employeeName = employee.getName();

        if(reportType.equalsIgnoreCase("salaryReport"))
        {
            System.out.println("print salary report of " + employeeName);
        }

        else if(reportType.equalsIgnoreCase("performanceReport" + employeeName))
        {
            System.out.println("print performance report of " + employeeName);
        }
    }
}
