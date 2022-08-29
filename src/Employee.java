public class Employee   // cookie cutter
{
    // instance variables
    private String empName;
    private double hours;
    private double rate;

    // class methods
    // set methods
    public void setName(String ename)
    {
        // store value of ename in variable instance of empName
        empName = ename;
    }
    public void setRate(double rate)
    {
        this.rate = rate;
    }

    public void setHours(double hours)
    {
        this.hours = hours;
    }


    // get methods
    public String getName( )
    {
        // return the value of the private instance variable
        return empName;
    }
    public double getRate()
    {
        return rate;
    }
    public double getHours()
    {
        return hours;
    }

}   //end class Employee
