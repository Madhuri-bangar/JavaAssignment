/*
 3)	Design a Java program to implement a Collection Management System that manages different types
  of collections such as lists, sets, and maps. 
  The program should allow users to perform the following operations for each type of collection:

b)	Sets:
i)	Add an element: The user can add an element to the set.
ii)	Remove an element: The user can remove an element from the set.
iii)	Display all elements: The user can view all elements in the set.
iv)	Implement exception handling to handle possible errors 
	(e.g., element not found in the list/set, duplicate keys in the map).
v)	Provide a user-friendly console interface for the user to interact with the Collection Management System.

 */


package javaAssignmentQue3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOperations {
		 public static void main(String[] args) {
		        Set<String> set = new HashSet<>();
		        Scanner sc = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("Menu");
		            System.out.println("1. Add element into the set");
		            System.out.println("2. Remove element from the set");
		            System.out.println("3. Display all the elements");
		            System.out.println("4. Exit the program");
		            System.out.println("Enter your choice");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("Enter the element to add:");
		                    String newElement = sc.next();
		                    if (set.add(newElement)) {
		                        System.out.println(newElement + " is added to the set");
		                    } else {
		                        System.out.println("Element already exists");
		                    }
		                    break;

		                case 2:
		                    System.out.println("Enter the element to remove:");
		                    String removable = sc.next();
		                    if (set.remove(removable)) {
		                        System.out.println(removable + " is removed from the set");
		                    } else {
		                        System.out.println("Element not found in the set");
		                    }
		                    break;

		                case 3:
		                    System.out.println("Elements of the set: " + set);
		                    break;

		                case 4:
		                    System.out.println("Exiting the program");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again.");
		                    break;
		            }

		        } while (choice != 4);

		        sc.close();	
	}

}
