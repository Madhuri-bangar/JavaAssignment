/*
 
 4)	Add new employees: The user can add details like employee ID, name, department, and salary.
a)	Update employee details: The user can update the name, department, or salary of an existing employee based on their employee ID.
b)	Delete an employee: The user can delete an employee from the system based on their employee ID.
c)	Display all employees: The user can view a list of all employees and their details.
d)	Search for an employee: The user can search for an employee by their employee ID and view their details.
e)	Requirements:
i)	Use Object-Oriented Programming (OOP) principles and create an Employee class with appropriate attributes and methods.
ii)	Use appropriate data structures (e.g., ArrayList, HashMap) to store the employee data.
iii)	Implement exception handling to handle possible errors (e.g., invalid employee ID, input validation).
iv)	Provide a user-friendly console interface for the user to interact with the Employee Management System.

 */

package JavaAssignmentQ4;

public class Employee {
    private int empid;
    private String empname;
    private String empdept;
    private double salary;

    public Employee(int empid, String empname, String empdept, double salary) {
        this.empid = empid;
        this.empname = empname;
        this.empdept = empdept;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdept() {
        return empdept;
    }

    public void setEmpdept(String empdept) {
        this.empdept = empdept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empid + ", Name: " + empname + ", Department: " + empdept + ", Salary: " + salary;
    }
}
