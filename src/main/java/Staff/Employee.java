package Staff;

public abstract class Employee {

    private String name;
    private String nIN;
    private double salary;

    public Employee(String name, String nIN, double salary) {
        this.name = name;
        this.nIN = nIN;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNIN() {
        return nIN;
    }

    public double getSalary() {
        return salary;
    }
}
