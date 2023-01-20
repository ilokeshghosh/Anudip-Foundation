package ExceptionHandling;

public class VotingException extends RuntimeException{
	public VotingException(String message){
		super(message);
	}
}
