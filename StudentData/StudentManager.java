import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    // ADD student
    public void addStudent(Student s) throws DuplicatePRNException, InvalidPRNException {
        for (Student st : students) {
            if (st.getPrn().equals(s.getPrn())) {
                throw new DuplicatePRNException("PRN already exists.");
            }
        }
        if (s.getPrn().length() != 10) {
            throw new InvalidPRNException("PRN must be 10 characters.");
        }
        students.add(s);
    }

    // DISPLAY all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) s.display();
        }
    }

    // SEARCH by PRN
    public Student searchByPrn(String prn) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getPrn().equals(prn)) return s;
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    // SEARCH by Name
    public List<Student> searchByName(String name) throws InvalidNameException {
        if (name.length() < 2) throw new InvalidNameException("Name too short.");
        List<Student> found = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) found.add(s);
        }
        if (found.isEmpty()) throw new InvalidNameException("No student found with name " + name);
        return found;
    }

    // SEARCH by Position
    public Student searchByIndex(int index) throws IndexOutOfBoundsException {
        return students.get(index);
    }

    // UPDATE student
    public void updateStudent(String prn, String newName, String newDob, int newMarks)
            throws StudentNotFoundException, InvalidNameException {
        Student s = searchByPrn(prn);
        if (newName.length() < 2) throw new InvalidNameException("Invalid new name.");
        s.setName(newName);
        s.setDob(newDob);
        s.setMarks(newMarks);
    }

    // DELETE student
    public void deleteStudent(String prn) throws StudentNotFoundException {
        Student s = searchByPrn(prn);
        students.remove(s);
    }
}
