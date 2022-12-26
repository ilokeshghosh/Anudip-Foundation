 package OOPs;
/*
 for overriding the child class method name should be the same as parent
 method name
 the  parameters passed in the method should also be the same there should be a is-a relationship (parent/child relation)
 */
class RBI{ //parent class
	public void loanInterest() {
		System.out.println("RBI :9% loan interest ");
	}
}

class SBI extends RBI{ //child 1 class
	public void loanInterest() {
		System.out.println("SBI : 5% loan interest");
		
		
	}
}

class HDFC extends RBI{ //child 2 class
	public void loanInterest() {
		System.out.println("HDFC : 8.5% loan interest ");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		RBI rbi ;
		RBI bank = new HDFC();
		bank.loanInterest();
		rbi = new SBI();
		rbi.loanInterest();
		rbi = new HDFC();
		rbi.loanInterest();

	}

}
