/* 
 * Göktuğ Sina Bekçioğulları
 * 150122039 
 */

// This program prints special pattern by using a mix of numbers and characters

import java.util.Scanner;

public class Pro3_150122039 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		int size = 0;
		
		// Greeting
		System.out.println("========================================\n" + "Welcome to the Num-Char printer program!\n"
				+ "========================================");
		
		String reExecutement;
		
		while (true) {
			
			do {
				
				// Prompt the user to enter the size
				System.out.print("Enter the size: ");
				size = input.nextInt();
				
				// Check whether the size value is appropriate
				if (size <= 0)
					System.out.print("Invalid size. Enter the size again: ");
				
			} while (0 >= size);
			
			// Print the pattern
			for (int i = 1; i <= size; i++) {
				
				// Print spaces
				for (int k = 1; k <= size - i; k++) {
					System.out.print(" ");
				}
				
		        // Print numbers
				for (int j = 1; j <= i; j++) {
		            System.out.print(j);
		        }

		        // Print characters in reverse order
		        for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
		            System.out.print(ch);
		        }
		        System.out.println();
			}
			
			// Reverse pattern
	        for (int i = size - 1; i >= 1; i--) {
	        	
				// Print spaces
				for (int k = 1; k <= size - i; k++) {
					System.out.print(" ");
				}
				
	            // Print numbers
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            
	            // Print characters in reverse order
	            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
	                System.out.print(ch);
	            }
	            System.out.println();
	        }
			
	        // Ask the user continue statement
			System.out.print("Would yo like to continue? (Y or N): ");
			reExecutement = input.next();
			
			if (reExecutement.equals("Y")) {
				continue;
			}else {
				System.out.println("Program ends. Bye :)");
				break;
			}
		}
	}
}
