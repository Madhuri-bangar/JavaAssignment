package JDBCAssignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) throws Exception {
        try (Connection connection = MyDbConnection.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\nEmployee Management System:");
                System.out.println("1. Add a new employee");
                System.out.println("2. Update employee details");
                System.out.println("3. Delete an employee");
                System.out.println("4. Display all employees");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        addEmployee(connection, scanner);
                        break;
                    case 2:
                        updateEmployee(connection, scanner);
                        break;
                    case 3:
                        deleteEmployee(connection, scanner);
                        break;
                    case 4:
                        displayAllEmployees(connection);
                        break;
                    case 5:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to add a new employee
    private static void addEmployee(Connection connection, Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        String sql = "INSERT INTO employees (empid, empname, empdept, empsal) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, department);
            statement.setDouble(4, salary);

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee added successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    // Method to update an existing employee's details
    private static void updateEmployee(Connection connection, Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter new employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new employee department: ");
        String department = scanner.nextLine();

        System.out.print("Enter new employee salary: ");
        double salary = scanner.nextDouble();

        String sql = "UPDATE employees SET empname = ?, empdept = ?, empsal = ? WHERE empid = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setString(2, department);
            statement.setDouble(3, salary);
            statement.setInt(4, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating employee: " + e.getMessage());
        }
    }

    // Method to delete an employee
    private static void deleteEmployee(Connection connection, Scanner scanner) {
        System.out.print("Enter employee ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM employees WHERE empid = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("Employee with ID " + id + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting employee: " + e.getMessage());
        }
    }

    // Method to display all employees
    private static void displayAllEmployees(Connection connection) {
        String sql = "SELECT * FROM employees";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("\nEmployee List:");
            System.out.println("ID\tName\t\tDepartment\tSalary");
            System.out.println("-----------------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("empid");
                String name = resultSet.getString("empname");
                String department = resultSet.getString("empdept");
                double salary = resultSet.getDouble("empsal");

                System.out.printf("%d\t%s\t\t%s\t\t%.2f%n", id, name, department, salary);
            }
        } catch (SQLException e) {
            System.out.println("Error displaying employees: " + e.getMessage());
        }
    }
}

/*
 * 
Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 102
Invalid choice. Please try again.

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 1
Enter employee ID: 102
Enter employee name: Ben
Enter employee department: HR
Enter employee salary: 600
Employee added successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 1
Enter employee ID: 103
Enter employee name: Chris
Enter employee department: Finance
Enter employee salary: 600
Employee added successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 1
Enter employee ID: 104
Enter employee name: David
Enter employee department: Management
Enter employee salary: 200
Employee added successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 1
Enter employee ID: 105
Enter employee name: Elcid
Enter employee department: sale
Enter employee salary: 800
Employee added successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 2
Enter employee ID to update: 103
Enter new employee name: Chris
Enter new employee department: IT
Enter new employee salary: 600
Employee updated successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 3
Enter employee ID to delete: 105
Employee deleted successfully!

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 4

Employee List:
ID	Name		Department	Salary
-----------------------------------------------------
101	Alice		IT		500.00
102	Ben		HR		600.00
103	Chris		IT		600.00
104	David		Management		200.00

Employee Management System:
1. Add a new employee
2. Update employee details
3. Delete an employee
4. Display all employees
5. Exit
Enter your choice: 5
Exiting the program.

 */
