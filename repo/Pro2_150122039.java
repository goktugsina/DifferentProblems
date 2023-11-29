/* 
 * Göktuğ Sina Bekçioğulları
 * 150122039 
 */

/* This is a program that computes a number series which starts with 0, 1, and 2, and each 
successive number is the summation of the sine, cosine, and tangent values of previous 
three numbers.*/

import java.util.Scanner;

public class Pro2_150122039 {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner inp = new Scanner(System.in);
		
		// Promp the user to enter the length
		System.out.print("Enter the length of the series: ");
		int length = inp.nextInt();
		
		double num1 = 0;
		double num2 = 1;
		double num3 = 2;
		
		System.out.printf("%.2f %.2f %.2f", num1, num2, num3);
		
		for (int i = 3; i < length; i++) {
			
			// Calculate and print the next number
			double nextNumber = Math.sin(num1) + Math.cos(num2) + Math.tan(num3);
			System.out.printf(" %.2f", nextNumber);
			
			// Keep and change the values
			num1 = num2;
			num2 = num3;
			num3 = nextNumber;
			}
		}
	}


