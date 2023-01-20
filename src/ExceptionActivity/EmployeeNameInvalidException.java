package ExceptionActivity;

public class EmployeeNameInvalidException extends RuntimeException{
		public EmployeeNameInvalidException(String message) {
			super(message);
		}
}
