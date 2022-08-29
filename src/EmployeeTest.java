public class EmployeeTest
{
    public static void main(String[] args)
    {
        System.out.println("Testing Employee class");
        // instantiate an object (create a cookie)
        Employee emp = new Employee();
        emp.setName("John Smith");
        emp.setRate(25.99);
        emp.setHours(40);

        System.out.println("Name is " + emp.getName());
        System.out.println(emp.getHours()+ " hours a week.");
        System.out.println("$"+ emp.getRate()+ " an hour.");
    }
}
