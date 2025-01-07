public class Worker extends Person {
    
    private double salary;
    
    public Worker(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }
    
    public void printSalary(){
        System.out.println("Salary: $" + salary);
    }
}
