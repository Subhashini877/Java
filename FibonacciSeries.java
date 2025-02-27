package fibonacci;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		

		
		    		        // Create a scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for the number of terms in the Fibonacci series
		        System.out.print("Enter the number of terms: ");
		        int n = scanner.nextInt();

		        // Initialize the first two terms of the Fibonacci series
		        int first = 0, second = 1;

		        // Print the Fibonacci series
		        System.out.println("Fibonacci Series up to " + n + " terms:");

		        // Loop through and print the Fibonacci numbers
		        for (int i = 1; i <= n; i++) {
		            System.out.print(first + " ");
		            int nextTerm = first + second;  // Calculate the next term
		            first = second;  // Update first to the second term
		            second = nextTerm;  // Update second to the next term
		        }

		        // Close the scanner
		        scanner.close();
		    }
		


	}


