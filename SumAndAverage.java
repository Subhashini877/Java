package sumandaverage;
import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		

		
		   
		        // Create a scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);
		        
		        // Ask the user for the number of elements
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();
		        
		        // Initialize variables for sum
		        double sum = 0;
		        
		        // Loop through to take input for each number
		        for (int i = 1; i <= n; i++) {
		            System.out.print("Enter number " + i + ": ");
		            double num = scanner.nextDouble();
		            sum += num; // Add each number to sum
		        }
		        
		        // Calculate the average
		        double average = sum / n;
		        
		        // Display the sum and average
		        System.out.println("Sum: " + sum);
		        System.out.println("Average: " + average);
		        
		        // Close the scanner
		        scanner.close();
		    }
		

	}


