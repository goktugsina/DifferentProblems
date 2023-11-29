/* 
 * Göktuğ Sina Bekçioğulları
 * 150122039 
 */

// This program simply computes the number of bits in the binary representation of N.

import java.util.Scanner;

public class Pro1_150122039 {

	public static void main(String[] args) {
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Create a variable to count the number of times of dividing the num by 2
		int times = 0;
		
		while (true) {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer number: ");
			int num = input.nextInt();
			
			// Create a variable to keep the num
			int temp = num;
			
			// End the program if the user enter the value of 0
			if (num == 0) {
				System.out.println("Program ends. Bye!");
					break;
			}else if (num < 0) {
				System.out.println("Illegal input");
			}else {
				
				// Compute the number of times of dividing num by 2
				while (temp >= 1) {
					temp /= 2;
					times++;				
				}
				
				// Print the times of dividing the num by 2
				System.out.println("The number of bits: " + times);
			}
			

			// Reset times
			times = 0;
			
			
		}
		
		
	}

}
