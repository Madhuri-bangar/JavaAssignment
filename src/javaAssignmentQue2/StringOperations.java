/*
 2)	Design a Java program that performs various string operations and uses control statements 
 for user input validation. The program should allow the user to perform the following operations:

a)	Extract Substring: The user can enter a string and specify the starting and ending index,
 and the program should extract and display the substring.


 */

package javaAssignmentQue2;

import java.util.Scanner;

public class StringOperations {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String inputString = sc.next();

	        System.out.println("Enter the starting index:");
	        int startIndex = sc.nextInt();

	        System.out.println("Enter the ending index:");
	        int endIndex = sc.nextInt();

	        
	        if (startIndex >= 0 && endIndex <= inputString.length() && startIndex < endIndex) 
	        {
	            String substring = inputString.substring(startIndex, endIndex);
	            System.out.println("The extracted substring is: " + substring);
	        } 
	        else
{
	            System.out.println("Invalid indices provided.");
	        }

	        sc.close();
}
}

/*
  Enter a string:
madhuriBangar
Enter the starting index:
0
Enter the ending index:
7
The extracted substring is: madhuri

 
*/