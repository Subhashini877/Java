package studentmarklist;
import java.util.Scanner;
public class mainapp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	           System.out.print("Enter 1st Student Name:");
		String student1name = sc.nextLine();
		System.out.print("Enter Roll Number:");
		int  student1rollNo= sc.nextInt();
		System.out.print("Enter Mark 1:");
		int   student1m1 = sc.nextInt();
		System.out.print("Enter Mark 2:");
		int  student1m2 = sc.nextInt();
		System.out.print("Enter Mark 3:");
		int   student1m3 = sc.nextInt();
		student s1 = new student( student1name, student1rollNo, student1m1, student1m2, student1m3);
	
	           System.out.print("Enter the 2nd Student Name:");
	           sc.nextLine();
	   		String  student2name = sc.nextLine();
	   		System.out.print("Enter Roll Number:");
	   		int   student2rollNo= sc.nextInt();
	   		System.out.print("Enter Mark 1:");
	   		int  student2m1 = sc.nextInt();
	   		System.out.print("Enter Mark 2:");
	   		int  student2m2 = sc.nextInt();
	   		System.out.print("Enter Mark 3:");
	   		int  student2m3 = sc.nextInt();
	   		student s2 = new student( student2name, student2rollNo, student2m1, student2m2, student2m3);
	   		
	   		System.out.print("Enter the 3rd Student Name:");
	           sc.nextLine();
	   		String  student3name = sc.nextLine();
	   		System.out.print("Enter Roll Number:");
	   		int   student3rollNo= sc.nextInt();
	   		System.out.print("Enter Mark 1:");
	   		int  student3m1 = sc.nextInt();
	   		System.out.print("Enter Mark 2:");
	   		int  student3m2 = sc.nextInt();
	   		System.out.print("Enter Mark 3:");
	   		int  student3m3 = sc.nextInt();
	   		student s3 = new student( student3name, student3rollNo, student3m1, student3m2, student3m3);
	   		System.out.println("\nStudent MarkList");
	   	           System.out.println("--------------------------");
	   	           
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		sc.close();
		}
}

