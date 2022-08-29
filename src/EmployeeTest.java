public class EmployeeTest
{
    public static void main(String[] args)
    {
        System.out.println("Testing Employee class");

        // instantiate an object (create a cookie)
        Employee emp = new Employee();

        // assign a value for name, rate, and hours
        emp.setName("John Smith");
        emp.setRate(10);
        emp.setHours(40);

        // verifiy by printing the value
        System.out.println("Name is " + emp.getName());
        System.out.println(emp.getHours()+ " hours a week.");
        System.out.println("$"+ emp.getRate()+ " an hour.");
    }
}
