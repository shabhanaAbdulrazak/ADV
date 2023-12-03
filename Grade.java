import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private double[] grades;

    public Student(String name, int numGrades) {
        this.name = name;
        this.grades = new double[numGrades];
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

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}

class GradeManager {
    private ArrayList<Student> students;
    private int numGrades;

    public GradeManager(int numGrades) {
        this.students = new ArrayList<>();
        this.numGrades = numGrades;
    }

    public void addStudent(String name) {
        Student student = new Student(name, numGrades);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateGrades(String name, double[] grades) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setGrades(grades);
                System.out.println("Grades updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void viewStudentInfo(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("Student Name: " + student.getName());
                System.out.println("Grades: ");
                for (int i = 0; i < student.getGrades().length; i++) {
                    System.out.println("  Exam " + (i + 1) + ": " + student.getGrades()[i]);
                }
                System.out.println("Average: " + student.calculateAverage());
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Average: " + student.calculateAverage());
            System.out.println();
        }
    }
}

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager gradeManager = new GradeManager(3); // Assuming 3 exams per student

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Grades");
            System.out.println("3. View Student Information");
            System.out.println("4. Print All Students");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    gradeManager.addStudent(studentName);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter grades (space-separated): ");
                    String[] gradeStr = scanner.nextLine().split(" ");
                    double[] grades = new double[gradeStr.length];
                    for (int i = 0; i < gradeStr.length; i++) {
                        grades[i] = Double.parseDouble(gradeStr[i]);
                    }
                    gradeManager.updateGrades(updateName, grades);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String viewName = scanner.nextLine();
                    gradeManager.viewStudentInfo(viewName);
                    break;
                case 4:
                    gradeManager.printAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            scanner.close();
        }
    }
}
