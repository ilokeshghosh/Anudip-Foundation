package batchapplication;

import java.util.Scanner;

public class BatchService {
	
	static Scanner sc= new Scanner(System.in);
	static Java java[] = new Java[20];
	static aws Aws[] = new aws[20];
	static int id;
	static long phone;
	static String name,email;
	static int jindex =0;
	static int aindex =0;
	
	
	
	
	//student info taking java course
	public static void javaStudentInfo() {
		System.out.print("\n \n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter the student Id : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student name : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		name = sc.nextLine();
		sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student email :");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		email = sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student mobile :");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		phone = sc.nextInt();
		
		
	
		
		java[jindex] = new Java(id, name, phone, email);
		jindex++;
		
		System.out.print("\n\n\n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Student details added");
		System.out.print("\n-------------------------|\n\n\n\n");
		
		
		
	}
	
	//student info taking aws info
	public static void awsStudentInfo() {
		System.out.print("\n \n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter the student Id : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student name : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		name = sc.nextLine();
		sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student email :");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		email = sc.nextLine();
		System.out.print("-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter student mobile :");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		phone = sc.nextInt();
		
		
	
		
		Aws[aindex] = new aws(id, name, phone, email);
		aindex++;
		
		System.out.print("\n\n\n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Student details added");
		System.out.print("\n-------------------------|\n\n\n\n");
		
		
	}
	
	
	
	//get java student details
	public static void getJavaStudentDetails() {
		
		for(int i=0;i<jindex;i++) {
			
			System.out.print("\n\n-------------------------|\n");
			System.out.print("|");
			System.out.print("JAVA COURSE");
			System.out.print("\n-------------------------|\n");
			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.println("Student ID :"+java[i].getStdId());
			System.out.print("----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Name  \t\t| "+java[i].getStdName());

			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Email \t\t| "+java[i].getEmail());

			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Mobile\t\t| "+java[i].getPhone());
			System.out.print("\n----------------------------------------------------------------------------|\n");

			
			System.out.println("\n \n \n \n \n \n \n");
			
		
		}
	}
	
	//get aws student details
	public  void getAwsStudentDetails() {
			for(int i=0;i<aindex;i++) {
			
				System.out.print("\n\n-------------------------|\n");
				System.out.print("|");
				System.out.print("AWS COURSE");
				System.out.print("\n-------------------------|\n");
				System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.println("Student ID :"+Aws[i].getStdId());
			System.out.print("----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Name  \t\t| "+Aws[i].getStdName());

			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Email \t\t| "+Aws[i].getEmail());

			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Student Mobile\t\t| "+Aws[i].getPhone());
			System.out.print("\n----------------------------------------------------------------------------|\n");

			
			System.out.println("\n \n \n \n \n \n \n");
	}
	}
	
	//update java student info
	public static void updateJavStudentInfo() {
		
		System.out.print("\n \n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter the student Id : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		id = sc.nextInt();
		System.out.print("-------------------------|\n");
		for(int i=0;i<jindex;i++) {
			if(id==java[i].getStdId()) {
				
			
				System.out.print("\n\n\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter the student Id : ");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				System.out.print("-------------------------|\n");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student name : ");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				name = sc.nextLine();
				sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student email :");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				email = sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student mobile :");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				phone = sc.nextInt();
			
			
				java[i] = new Java(id, name,  phone,email);
				
				System.out.print("\n\n\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Student details updated");
				System.out.print("\n-------------------------|\n\n\n\n");
				
			}else {
				throw new StudentNotFoundException("Student Details Not Found");
			}
				
			
		}
	}
	
	
	//update aws student info
	public static void updateAwsStudentInfo() {
		System.out.print("\n \n\n-------------------------|\n");
		System.out.print("|");
		System.out.print("Enter the student Id : ");
		System.out.print("\n-------------------------|\n");
		System.out.print("Your input : ");
		id = sc.nextInt();
		System.out.print("-------------------------|\n");
		for(int i=0;i<aindex;i++) {
			if(id==Aws[i].getStdId()) {
				
			
				System.out.print("\n\n\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter the student Id : ");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student name : ");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				name = sc.nextLine();
				sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student email :");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				email = sc.nextLine();
				System.out.print("\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Enter student mobile :");
				System.out.print("\n-------------------------|\n");
				System.out.print("Your input : ");
				phone = sc.nextInt();
				System.out.print("-------------------------|\n");
			
			
				Aws[i] = new aws(id, name,  phone,email);
				
				System.out.print("\n\n\n-------------------------|\n");
				System.out.print("|");
				System.out.print("Student details updated");
				System.out.print("\n-------------------------|\n\n\n\n");
				
			}else {
				throw new StudentNotFoundException("Student Details Not Found");
			}
				
			
		}
	}
	
	
	

	
	

}
