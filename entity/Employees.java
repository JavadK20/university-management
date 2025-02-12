package entity;
public class Employees {
    String name;
    String faculty;
    Long employeeID;

    public Employees(String name, String faculty, Long employeeID) {
        this.name = name;
        this.faculty = faculty;
        this.employeeID = employeeID;
    }

    public Employees() {
    }
}
