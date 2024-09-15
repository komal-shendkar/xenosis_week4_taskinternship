package xenosis_week4project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee
{
	private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    
    public String toString() {
        return "Name: " + name + ", Position: " + position + ", Salary: $" + salary;
    }
}



public class EmployeeManager {
	
	 private static Map<Integer, Employee> employeeMap = new HashMap<>();

	    
	    public static void addEmployee(int id, Employee employee) {
	        employeeMap.put(id, employee);
	        System.out.println("Employee added: " + employee);
	    }

	   
	    public static Employee getEmployee(int id) {
	        return employeeMap.get(id);
	    }
	    

	    public static void displayAllEmployees() {
	        if (employeeMap.isEmpty()) {
	            System.out.println("No employees found.");
	        } else {
	            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
	                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
	            }
	        }
	    }
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        int choice;
	        
	        do {
	            System.out.println("\nEmployee Management System");
	            System.out.println("1. Add Employee");
	            System.out.println("2. Retrieve Employee");
	            System.out.println("3. Display All Employees");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 
	            
	            switch (choice) {
	                case 1:
	                    
	                    System.out.print("Enter Employee ID: ");
	                    int id = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Enter Employee Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Employee Position: ");
	                    String position = scanner.nextLine();
	                    System.out.print("Enter Employee Salary: ");
	                    double salary = scanner.nextDouble();
	                    scanner.nextLine(); 
	                    
	                    Employee employee = new Employee(name, position, salary);
	                    addEmployee(id, employee);
	                    break;
	                    
	                case 2:
	                    
	                    System.out.print("Enter Employee ID to retrieve: ");
	                    int retrieveId = scanner.nextInt();
	                    scanner.nextLine(); 
	                    
	                    Employee retrievedEmployee = getEmployee(retrieveId);
	                    if (retrievedEmployee != null) {
	                        System.out.println("Employee Details: " + retrievedEmployee);
	                    } else {
	                        System.out.println("Employee with ID " + retrieveId + " not found.");
	                    }
	                    break;
	                    
	                case 3:
	                    
	                    displayAllEmployees();
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


