package armstrong;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		


		        // Create a scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for a number
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Calculate the number of digits in the number
		        int originalNumber = number;
		        int sum = 0;
		        int numberOfDigits = String.valueOf(number).length();

		        // Check for Armstrong number
		        while (number > 0) {
		            int digit = number % 10;  // Get the last digit
		            sum += Math.pow(digit, numberOfDigits);  // Add the digit raised to the power of number of digits
		            number /= 10;  // Remove the last digit
		        }

		        // Check if the sum equals the original number
		        if (sum == originalNumber) {
		            System.out.println(originalNumber + " is an Armstrong number.");
		        } else {
		            System.out.println(originalNumber + " is not an Armstrong number.");
		        }

		        // Close the scanner
		        scanner.close();
		    }
		

	}


