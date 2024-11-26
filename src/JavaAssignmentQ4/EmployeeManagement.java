package JavaAssignmentQ4;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManagement {

    private HashMap<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee) 
    {
        employees.put(employee.getEmpid(), employee);  
        System.out.println("Employee added successfully.");
    }

    public void updateEmployee(int empid, String name, String dept, double salary)
    {
        Employee employee = employees.get(empid);
        if (employee != null) {
            employee.setEmpname(name);
            employee.setEmpdept(dept);
            employee.setSalary(salary);
            System.out.println("Employee details updated successfully.");
        } else 
        {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(int empid)
    {
        if (employees.remove(empid) != null)
        {
            System.out.println("Employee deleted successfully.");
        } else 
        {
            System.out.println("Employee not found.");
        }
    }

    public void displayAllEmployees() 
    {
        if (employees.isEmpty()) 
        {
            System.out.println("No employees found.");
        } else 
        {
            for (Employee employee : employees.values()) 
            {
                System.out.println(employee);
            }
        }
    }

    public void searchEmployee(int empid)
    {
        Employee employee = employees.get(empid);
        if (employee != null)
        {
            System.out.println(employee);
        } else 
        {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        EmployeeManagement ems = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt(); 
                    sc.nextLine();  
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = sc.nextDouble();
                    ems.addEmployee(new Employee(id, name, dept, salary));
                    break;
                    
                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter new Employee Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter new Employee Department: ");
                    dept = sc.nextLine();
                    System.out.print("Enter new Employee Salary: ");
                    salary = sc.nextDouble();
                    ems.updateEmployee(id, name, dept, salary);
                    break;
                    
                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    id = sc.nextInt();
                    ems.deleteEmployee(id);
                    break;
                    
                case 4:
                    ems.displayAllEmployees();
                    break;
                case 5:
                    System.out.print("Enter Employee ID to search: ");
                    id = sc.nextInt();
                    ems.searchEmployee(id);
                    break;
                    
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
/*
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 1
Enter Employee ID: 101
Enter Employee Name: Alice
Enter Employee Department: IT
Enter Employee Salary: 600
Employee added successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 1
Enter Employee ID: 102
Enter Employee Name: Ben
Enter Employee Department: Finance
Enter Employee Salary: 900
Employee added successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 4
Employee ID: 101, Name: Alice, Department: IT, Salary: 600.0
Employee ID: 102, Name: Ben, Department: Finance, Salary: 900.0
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 5
Enter Employee ID to search: 101
Employee ID: 101, Name: Alice, Department: IT, Salary: 600.0
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 1
Enter Employee ID: 103
Enter Employee Name: Account
Enter Employee Department: It
Enter Employee Salary: 700
Employee added successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 2
Enter Employee ID to update: 103
Enter new Employee Name: Chris
Enter new Employee Department: Account
Enter new Employee Salary: 800
Employee details updated successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 1
Enter Employee ID: 104
Enter Employee Name: David
Enter Employee Department: Management
Enter Employee Salary: 600
Employee added successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 3
Enter Employee ID to delete: 104
Employee deleted successfully.
1. Add Employee
2. Update Employee
3. Delete Employee
4. Display All Employees
5. Search Employee
6. Exit
Enter your choice: 6
Exiting...

*/