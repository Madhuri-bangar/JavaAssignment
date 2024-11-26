/*
 2)	Design a Java program that performs various string operations and uses control statements 
 for user input validation. The program should allow the user to perform the following operations:
 
b)	Split a Sentence: The user can enter a sentence, and the program should split it into
 words and display them.

 */

package javaAssignmentQue2;

import java.util.Scanner;

public class SplitSentence {
public static void main( String arg[]) {
	
	 Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the sentence:");
     
     String sentence = scanner.nextLine();
     
     String[] words = sentence.split(" ");
     
     for (String word : words) {
         System.out.println(word);
     }
     
     scanner.close();  
	}

}


/*
 output:
 Enter the sentence:
The user can enter a sentence
The
user
can
enter
a
sentence
*/
