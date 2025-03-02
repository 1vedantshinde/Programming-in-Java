//Main.java

import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StudentOperations operations = new StudentOperations();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Enter Name: ");
			String name = scan.nextLine();

			System.out.println("Enter PRN: ");
			int prn = Integer.parseInt(scan.nextLine());

			System.out.println("Enter Department: ");
			String dept = scan.nextLine();

			System.out.println("Enter CGPA: ");
			double cgpa = Double.parseDouble(scan.nextLine());

			System.out.println("Enter Batch: ");
			String batch = scan.nextLine();

			Student student = new Student(name, prn, dept, cgpa, batch);
			operations.addStudent(student);
		}
		
		while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());
            
            switch (choice) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();
                    
                    System.out.println("Enter PRN: ");
                    int prn = Integer.parseInt(scan.nextLine());
                    
                    System.out.println("Enter Department: ");
                    String dept = scan.nextLine();
                    
                    System.out.println("Enter CGPA: ");
                    double cgpa = Double.parseDouble(scan.nextLine());
                    
                    System.out.println("Enter Batch: ");
                    String batch = scan.nextLine();
                    
                    operations.addStudent(new Student(name, prn, dept, cgpa, batch));
                    break;
                
                case 2:
                    System.out.println("Enter PRN of student to edit: ");
                    int editPrn = Integer.parseInt(scan.nextLine());
                    operations.editStudent(editPrn, scan);
                    break;
                
                case 3:
                    System.out.println("Enter PRN of student to delete: ");
                    int deletePrn = Integer.parseInt(scan.nextLine());
                    operations.deleteStudent(deletePrn);
                    break;
                
                case 4:
                    System.out.println("Enter PRN of student to search: ");
                    int searchPrn = Integer.parseInt(scan.nextLine());
                    operations.searchStudent(searchPrn);
                    break;
                
                case 5:
                    operations.displayStudents();
                    break;
                
                case 6:
                    System.out.println("Exiting...");
                    scan.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
	}

}
