package staff.management;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nIN, double salary, String deptName, double budget) {
        super(name, nIN, salary, deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return ((this.getSalary() * 2) / 100);
    }
}
