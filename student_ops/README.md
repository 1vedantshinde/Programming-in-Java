## Explanation

> Problem: Create a Student class describing attributes of a student like prn, name, DoB, marks etc. Create an array of objects of Student class and perform operations like: Add students, Display, Search (by prn, by name, by position), Update/Edit and Delete. Write a menu-driven Java Program to study the concepts of classes, array of objects, instance members, constructors in java.

### Classes:
##### MENU
The `Menu` class is responsible for letting the user enter the initial student details that are required for the rest of the code to work. It takes the details of 5 students and then displays the operations that can be performed on them. This includes the following:
1. Add Student Details
2.  Edit Student Details
3. Delete Student Details
4. Search Student Details
5. Display Student Details
6. Exit

Based on the input of the user, the corresponding function in the `StudentOperations` class is called.

##### StudentOperations
The `StudentOperations` class is responsible for managing student records. It provides functionalities to add, edit, delete, search, and display student information using an `ArrayList<Student>`
Method Name | Purpose  
------------ | ---------  
`addStudent()` | Adds a student to the list and prints a confirmation once added.
`editStudent()` | Edits details of a student using PRN, using the `setDetails()` method from Student class
`deleteStudent()` | Deletes a student using PRN, and prints a confirmation once deleted.
`searchStudent()` | Searches and displays student details if it exists, error if not.
`displayStudents()` | Displays all student records 

##### Student
he `Student` class represents an individual student with attributes like name, PRN, department, batch, and CGPA. It provides getter and setter methods to access and modify student details.
| Method Name | Purpose |
|------------|---------|
| `Student(String, int, String, double, String)` | Constructor to initialize a student |
| `getName()` | Returns student’s name |
| `getPRN()` | Returns student’s PRN |
| `getdept()` | Returns student’s department |
| `getbatch()` | Returns student’s batch |
| `getcgpa()` | Returns student’s CGPA |
| `setName(String)` | Updates student’s name |
| `setPRN(int)` | Updates student’s PRN |
| `setdept(String)` | Updates student’s department |
| `setbatch(String)` | Updates student’s batch |
| `setcgpa(double)` | Updates student’s CGPA |
| `display()` | Prints all student details |
