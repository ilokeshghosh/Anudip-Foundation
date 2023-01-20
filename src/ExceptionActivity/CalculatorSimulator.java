package ExceptionActivity;

//Question Link :   https://github.com/ilokeshghosh/Anudip-Foundation/blob/main/Notes%20and%20Files/ExceptionHandling_In_Java_Activity_1(1).pdf


public class CalculatorSimulator {

	public static void main(String[] args) {
		TaxCalculator tc= new TaxCalculator();
		
		System.out.println("Test Case -1");
		System.out.println();
		
//		test case -1
		try {
			try {
				System.out.println("Tax amount is  "+tc.calculateTax("Ron", false, 34000));
			}
			catch(EmployeeNameInvalidException ex) {
				System.out.println(ex.getMessage());
			}
			catch(TaxNotEligibleException e) {
				System.out.println(e.getMessage());
			}
		}catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Test Case - 2");
		System.out.println();
		
		//test case-2
		try {
			try {
				System.out.println("Tax amount is  "+tc.calculateTax("Tim", true, 1000));				
			}
			catch(EmployeeNameInvalidException ex) {
				System.out.println(ex.getMessage());
			}
			catch(TaxNotEligibleException e) {
				System.out.println(e.getMessage());
			}
		}catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Test Case - 3");
		System.out.println();
		
		
//		Test case-3
		try {
			try {
				System.out.println("Tax amount is  "+tc.calculateTax("Jack", true, 55000));
			}
			catch(EmployeeNameInvalidException ex) {
				System.out.println(ex.getMessage());
			}
			catch(TaxNotEligibleException e) {
				System.out.println(e.getMessage());
			}
		}catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}
	
		
		System.out.println();
		System.out.println();
		System.out.println("Test Case - 4");
		System.out.println();
	
		
		
		
//		test case -4
		try {
			try {
				System.out.println("Tax amount is  "+tc.calculateTax("", true, 30000));			
			}
			catch(EmployeeNameInvalidException ex) {
				System.out.println(ex.getMessage());
//				ex.printStackTrace();
			}
			catch(TaxNotEligibleException e) {
				System.out.println(e.getMessage());
			}
		}catch(CountryNotValidException e) {
			System.out.println(e.getMessage());
		}

		
		
		
		
		
	}

}
