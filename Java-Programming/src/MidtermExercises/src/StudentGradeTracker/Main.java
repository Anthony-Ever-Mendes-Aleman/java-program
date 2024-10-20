package StudentGradeTracker;

public class Main {
    public static void main(String[] args) {
        double[] grades = {90, 99.9, 94, 73, 86.7};
        Student student = new Student("Anthony", grades);

        System.out.println("Student: " + student.getName());
        student.printGrades();
        System.out.println("\nAverage: " + student.average());
    }
}
