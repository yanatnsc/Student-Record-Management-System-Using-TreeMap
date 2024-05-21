//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentRecordManager studentRecordManager = new StudentRecordManager();

        // Adding initial student records
        System.out.println("Test 1: Adding students record in non-sorted order, with last attempt to add record on an existing id 777. ");
        studentRecordManager.add(666, "FFF", 1.5);
        studentRecordManager.add(111, "AAA", 4.0);
        studentRecordManager.add(555, "EEE", 2.0);
        studentRecordManager.add(222, "BBB", 3.5);
        studentRecordManager.add(444, "DDD", 2.5);
        studentRecordManager.add(333, "CCC", 3.0);
        studentRecordManager.add(777, "GGG", 1.0);
        studentRecordManager.add(777, "HHH", 1.0);
        System.out.println();

        System.out.println("Test 2: Displaying all student records. ");
        studentRecordManager.display();
        System.out.println();

        System.out.println("Test 3: Updating GPA of DDD (student ID 444, updated GPA 3.1). ");
        studentRecordManager.update(444, 3.1);
        studentRecordManager.display();
        System.out.println();

        System.out.println("Test 4: Deleting student EEE (student ID 555). ");
        studentRecordManager.delete(555);
        System.out.println();
        System.out.println("Displaying all student records after deletion. ");
        studentRecordManager.display();
        System.out.println();

        System.out.println("Test 5: Showing students with GPA higher than 3.0. ");
        studentRecordManager.findGpa(3.0);
    }
}