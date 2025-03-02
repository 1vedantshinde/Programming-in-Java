//Student.java

import java.util.*;

class Student {
    private String name;
    private int prn;
    private String dept;
    private String batch;
    private double cgpa;

    public Student(String name, int prn, String dept, double cgpa, String batch) {
        this.name = name;
        this.prn = prn;
        this.dept = dept;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public int getPRN() {
        return prn;
    }

    public void setDetails(Scanner scan) {
        System.out.println("Enter new Name: ");
        this.name = scan.nextLine();
        System.out.println("Enter new Department: ");
        this.dept = scan.nextLine();
        System.out.println("Enter new CGPA: ");
        this.cgpa = Double.parseDouble(scan.nextLine());
        System.out.println("Enter new Batch: ");
        this.batch = scan.nextLine();
    }
    
    public void display() {
        System.out.println("Name: " + name + " PRN: " + prn + " Department: " + dept + " Batch: " + batch + " CGPA: " + cgpa);
    }
}
