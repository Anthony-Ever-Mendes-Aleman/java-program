package employeedepartment;

public class Main {
    public static void main(String[] args) {
        Department tech = new Department("Tech", new Employee("Anthony", 301140312));
        tech.showDepartmentDetails();
    }
}
