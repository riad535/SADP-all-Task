public class Employee
{
    String name;
    int age;
    String grade;

    Employee(String name, int age,String grade)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
    public String getGrade()
    {
        return grade;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}