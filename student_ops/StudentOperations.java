//StudentOperations.java

import java.util.*;

class StudentOperations {
    private ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added.");
    }

    public void editStudent(int prn, Scanner scan) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.setDetails(scan);
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void deleteStudent(int prn) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getPRN() == prn) {
                iterator.remove();
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void searchStudent(int prn) {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        System.out.println("Student with PRN " + prn + " not found.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }
}
