package batchapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BatchMain {

	public static void main(String[] args) throws IOException {
		int choice;
		int ch;
		BatchService batch = new BatchService();
		
		//buffer reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Anudp Foundation : ");
		do {
			
			System.out.print("Menu :\n");
			System.out.print("-------------------------|\n");
			System.out.print("|");
			System.out.print("1)JAVA ");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("2)AWS");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("3)Others");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("4)Exit");
			System.out.print("\n-------------------------|\n");
			
			System.out.print("Your input : ");
			choice = sc.nextInt();
			System.out.print("-------------------------|\n");
			switch(choice) {
			case 1 ->{
				
				System.out.print("\n\nJAVA\n");
				System.out.print("-------------------------|\n");
				System.out.print("|");
				System.out.print("1)Enter student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("2)Show student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("3)update student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
			
				
				ch = sc.nextInt();
				System.out.print("-------------------------|\n\n");
			
				
				switch(ch) {
				case 1->batch.javaStudentInfo();
				
				case 2-> batch.getJavaStudentDetails();
				
				case 3-> batch.updateJavStudentInfo();
				
				default -> System.err.println("Wrong Choice");
					}
				}
			case 2-> {
				System.out.print("\n\nAWS\n");
				System.out.print("-------------------------|\n");
				System.out.print("|");
				System.out.print("1)Enter student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("2)Show student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("3)update student info");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				ch = sc.nextInt();
				System.out.print("-------------------------|\n");
				switch(ch) {
				case 1->batch.awsStudentInfo();
				
				case 2-> batch.getAwsStudentDetails();
				
				case 3-> batch.updateAwsStudentInfo();
				
				default -> {
					System.out.print("\n-------------------------|\n");
					System.out.print("|");
					System.out.print("Wrong choice");
					System.out.print("\n-------------------------|\n");
					
					}
				}
			}
			
			case 3-> {
				
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter the Course Name : ");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				sc.nextLine();
//				String course = br.readLine();
				String course = sc.nextLine();
				System.out.print("\n-------------------------|\n");
			
				if(course.equalsIgnoreCase("java") || course.equalsIgnoreCase("aws")) {
					System.out.print("\n\n\n-------------------------|\n");
					System.out.print("|");
					System.out.print("Course Found ");
					System.out.print("\n-------------------------|\n\n\n");
					
				}
				else {
					throw new courseNotFoundException("Course Not Found");
				}
			}
			
			case 4-> {
				{
					System.out.print("\n----------------------------------------------------------|\n");
					System.out.print("|");
					System.out.print("Exiting The Application.........!!!!");
					System.out.print("\n----------------------------------------------------------|\n");
					System.out.print("----------------------------------------------------------|\n");
					System.out.print("|");
					System.out.print("Exited The Application.........!!!!");
					System.out.print("\n----------------------------------------------------------|\n");
					System.exit(0);
					
				}
			}
			
			default ->{
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Wrong choice");
				System.out.print("\n-------------------------|\n");
				
			}
			}
			
		}while(true);

	}

}
