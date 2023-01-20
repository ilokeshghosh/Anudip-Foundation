package ExceptionActivity;

public class TaxCalculator {

	public double calculateTax(String empName, boolean isIndian,  double empSal) throws EmployeeNameInvalidException, CountryNotValidException,TaxNotEligibleException{
		double taxAmount=0;
		if(isIndian) {
			if(empName!="") {
				if(empSal>100000) {
					taxAmount = (empSal*8)/100;
				}
				else if(empSal>=50000 && empSal<=100000) {
					taxAmount = empSal*6/100;
				}
				else if(empSal>=30000 && empSal<50000) {
					taxAmount = (empSal*5)/100;
				}
				else if(empSal>=10000 && empSal<30000) {
					taxAmount = (empSal*5)/100;
				}
				else {
					throw new TaxNotEligibleException("The employee does not need to pay tax");
					
				}
			}
			else {
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
		}
		else {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		
		return taxAmount;
	}
	

}
