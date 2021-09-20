public class atmOperation {
	public static void Withdrawal(int Pin,int withdrawAmount) {
	    int pin=123;
	    int accBalance=50000;
	    int balance=accBalance-withdrawAmount;
	    if(pin==Pin && accBalance>withdrawAmount) {
	    	System.out.println("Login succesfull");
	    	System.out.println("Balance Amount is " +balance);
	    }else {
	    	System.out.println("Invalid Pin ");
	    	System.out.println("Insufficient balance");
	    }
	}


	public static void main(String[] args) {
		AtmOperation.Withdrawal(235,70000);
		

	}

}