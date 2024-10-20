package employeedepartment;

public class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setAge(int age) {
        this.id = age;
    }

    public String getEmployeeInfo(){
        return "Name: " + name + "\n Id: " + id;
    }
}
