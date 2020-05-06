public class Account {
    private double tax = 0.5;
    private double net ;

    public Employee employee;
    public Account(Employee employee)
    {
        this.net = employee.salary - tax;
    }

    public double getNet() {
        return net;
    }
}