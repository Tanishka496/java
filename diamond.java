 import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        String universityName = scanner.nextLine();

        System.out.print("Enter University Location: ");
        String location = scanner.nextLine();

        System.out.print("\nEnter Student Name: ");
        String studentName = scanner.nextLine();
        

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Student Course: ");
        String course = scanner.nextLine();

        System.out.print("\nEnter Faculty Name: ");
        String facultyName = scanner.nextLine();

        System.out.print("Enter Faculty ID: ");
        int facultyId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Faculty Department: ");
        String department = scanner.nextLine();

        Student student = new Student();
        student.setUniversityDetails(universityName, location);
        student.setStudentDetails(studentName, studentId, course);

        Faculty faculty = new Faculty();
        faculty.setUniversityDetails(universityName, location);
        faculty.setFacultyDetails(facultyName, facultyId, department);

        Dashboard dashboard = new Dashboard(student, faculty);
        dashboard.showDashboard();

        scanner.close();
    }
}

interface University {
    void setUniversityDetails(String name, String location);
    void displayUniversityInfo();
}

class Student implements University {
    private String universityName;
    private String location;
    private String studentName;
    private int studentId;
    private String course;

    public void setUniversityDetails(String name, String location) {
        this.universityName = name;
        this.location = location;
    }

    public void setStudentDetails(String studentName, int studentId, String course) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.course = course;
    }

    public void displayUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Location: " + location);
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class Faculty implements University {
    private String universityName;
    private String location;
    private String facultyName;
    private int facultyId;
    private String department;

    public void setUniversityDetails(String name, String location) {
        this.universityName = name;
        this.location = location;
    }

    public void setFacultyDetails(String facultyName, int facultyId, String department) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
        this.department = department;
    }

    public void displayUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Location: " + location);
    }

    public void displayFacultyInfo() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}

class Dashboard {
    private Student student;
    private Faculty faculty;

    public Dashboard(Student student, Faculty faculty) {
        this.student = student;
        this.faculty = faculty;
    }

    public void showDashboard() {
        System.out.println("\n=== University Dashboard ===");
        student.displayUniversityInfo();
        System.out.println("\n--- Student Info ---");
        student.displayStudentInfo();
        System.out.println("\n--- Faculty Info ---");
        faculty.displayFacultyInfo();
    }
}

