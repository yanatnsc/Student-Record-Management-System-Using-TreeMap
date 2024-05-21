import java.util.TreeMap;
import java.util.Map;

public class StudentRecordManager {
    TreeMap<Integer, Student> studentRecords = new TreeMap<Integer, Student>();

    public void add(int id, String name, double gpa) {
        if (studentRecords.containsKey(id)) {
            System.out.println("Student ID " + id + " already exists.");
        } else {
            studentRecords.put(id, new Student(id, name, gpa));
            System.out.println("Student record added: " + studentRecords.get(id));
        }
    }

    //https://github.com/TejasKoshti/Java-Console-Shopping-System/blob/main/BLClass.java
    public void delete(int id) {
        if (studentRecords.containsKey(id)) {
            System.out.println("Student record deleted: " + studentRecords.get(id));
            studentRecords.remove(id);
        } else {
            System.out.println("Student ID not found.");
        }
    }

    public void update(int id, double gpa) {
        Student student = studentRecords.get(id);
        if (student != null) {
            student.setGpa(gpa);
            System.out.println("Student record updated: " + studentRecords.get(id));
        } else {
            System.out.println("Student ID not found.");
        }
    }

    public void display() {
        for (int id : studentRecords.keySet()) {
            System.out.println(id + ": " + studentRecords.get(id));
        }
    }

    public void findGpa(double gpa) {
        for (Map.Entry<Integer, Student> entry : studentRecords.entrySet()) {
            if (entry.getValue().getGpa() > gpa) {
                System.out.println(entry.getValue());
            }
        }
    }
}
