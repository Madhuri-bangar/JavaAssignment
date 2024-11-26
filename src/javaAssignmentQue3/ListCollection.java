/*
 3)	Design a Java program to implement a Collection Management System that manages different types 
 of collections such as lists, sets, and maps. 
 The program should allow users to perform the following operations for each type of collection:

a)	Lists:
i)	Add an element: The user can add an element to the list.
ii)	Remove an element: The user can remove an element from the list.
iii)	Display all elements: The user can view all elements in the list

 */


package javaAssignmentQue3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCollection {
	public static void main(String[] args) {
		
		
				ArrayList<String> List = new ArrayList();
				Scanner sc = new Scanner(System.in);
				int choice;
				
				do {
					System.out.println("Menu");
					System.out.println("1.Add an element");
					System.out.println("2.Remove an element");
					System.out.println("3.Display all element");
					System.out.println("4.Exit");
					System.out.println("enter your choice");
					choice = sc.nextInt();
					
					switch(choice) {
					
					case 1: 
							System.out.println("Enter string to add to the list");
							String newString = sc.next();
							List.add(newString);
							System.out.println(newString+" added successfully");
							break;
					case 2:
						   System.out.println("Enter element to remove");
						    String removableEle = sc.next();
						   if(List.remove(removableEle)) {
						   System.out.println(removableEle+" is removed");}
						   else {
							   System.out.println("element is not found");
						   }
						   break;
					case 3:
							System.out.println("list element "+List);
							break;
					case 4:
							System.out.println("exiting the program");
							break;
							
					default:
						System.out.println("You entered wrong value");
					
					}
					
				}
				while(choice != 4);
				sc.close();
			}

	}


