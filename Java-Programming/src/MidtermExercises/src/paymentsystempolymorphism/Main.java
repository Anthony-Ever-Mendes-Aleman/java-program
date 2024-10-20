package paymentsystempolymorphism;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Anthony", 902332.21);
        Contractor contractor = new Contractor("Jerome", 231);
        contractor.setHoursWorked(500);
        Freelancer freelancer = new Freelancer("Anthony");
        freelancer.setJobAmount(8);

        System.out.println("Employee Salary: " + employee.pay());
        System.out.println("Contractor Salary: " + contractor.pay());
        System.out.println("Freelancer Salary: " + freelancer.pay());
    }
}
