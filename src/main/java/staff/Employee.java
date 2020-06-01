package staff;

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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double raiseAmount) {
        this.setSalary(( this.getSalary() + raiseAmount));
    }

    public double payBonus(){
        return ((this.getSalary() *1)/100);
    }

}
