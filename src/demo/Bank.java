package demo;

public abstract class Bank {
	
	//partial abstration
	//Hiding the implementaion logic is called abstration
	//final ,static , non-static are allowed
	
	int amt=100;
	final int rate=10;
	static int loanRate=5;
	
	public abstract void loan();  //abstract method --no method body
	
	 
	//non abstract methods
	public void credit() {             // common method
		System.out.println("credit");
	}
	
	public void debit() {
		System.out.println("debit");
	}

}

class HDFC extends Bank{
	
	@Override
	public void loan() {
		System.out.println("HDFC--loan");
	}
	
	public void funds() {
		System.out.println("HDFC--funds");
	}
	
}


