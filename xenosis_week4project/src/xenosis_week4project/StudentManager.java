package xenosis_week4project;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
 private int id;
 private String name;

 public Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 
 public String toString() {
     return "ID: " + id + ", Name: " + name;
 }
}


public class StudentManager {
	
	 private ArrayList<Student> students;

	    
	    public StudentManager() {
	        students = new ArrayList<>();
	    }

	    
	    public void addStudent(int id, String name) {
	        Student student = new Student(id, name);
	        students.add(student);
	        System.out.println("Student added: " + student);
	    }

	    
	    public void removeStudent(int id) {
	        Iterator<Student> iterator = students.iterator();
	        boolean removed = false;
	        while (iterator.hasNext()) {
	            Student student = iterator.next();
	            if (student.getId() == id) {
	                iterator.remove();
	                System.out.println("Student with ID " + id + " removed.");
	                removed = true;
	                break;
	            }
	        }
	        if (!removed) {
	            System.out.println("Student with ID " + id + " not found.");
	        }
	    }

	    public void displayStudents() {
	        if (students.isEmpty()) {
	            System.out.println("No students in the list.");
	        } else {
	            System.out.println("List of students:");
	            for (Student student : students) {
	                System.out.println(student);
	            }
	        }
	    }

	public static void main(String[] args) 
	{
		 StudentManager manager = new StudentManager();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nStudent Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display Students");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    
	                    System.out.print("Enter student ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    manager.addStudent(id, name);
	                    break;

	                case 2:
	                    
	                    System.out.print("Enter student ID to remove: ");
	                    int removeId = scanner.nextInt();
	                    scanner.nextLine(); 
	                    manager.removeStudent(removeId);
	                    break;

	                case 3:
	                    
	                    manager.displayStudents();
	                    break;

	                case 4:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }
	

	}


