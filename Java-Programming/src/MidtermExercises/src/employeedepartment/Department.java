package employeedepartment;
import employeedepartment.Employee;
public class Department {
    private String departmentName;
    private Employee employee;
    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public Employee getEmployee() {
         return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;

    }

    public void showDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println(employee.getEmployeeInfo());

    }

}
