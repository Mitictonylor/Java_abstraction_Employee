package Staff.management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nIN, double salary, String deptName) {
        super(name, nIN, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }

}
