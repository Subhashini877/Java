package palindrome;
import java.util.Scanner;
public class Palindrome {
		public static void main(String[] args) {
		
				   		        Scanner scanner = new Scanner(System.in);

		        // Taking input from user
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        // Convert the string to lower case to make it case-insensitive
		        input = input.toLowerCase();

		        // Reverse the string
		        String reversedString = new StringBuilder(input).reverse().toString();

		        // Check if the original string is equal to the reversed string
		        if (input.equals(reversedString)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }

		        scanner.close();
		    }
		


	}


