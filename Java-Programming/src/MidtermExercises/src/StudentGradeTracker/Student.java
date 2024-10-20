package StudentGradeTracker;

public class Student {
    public String name;
    double[] grades;
    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public double[] getGrades() {
        return grades;
    }
    public void setGrades(double[] grades) {
        this.grades = grades;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double average() {
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            average += grades[i];
        }
        return average / grades.length;
    }

    public void printGrades() {
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++)
        {
            System.out.print(grades[i] + ", ");

        }
    }
}
