package demo;

public class Test {

	public static void main(String[] args) {
		HDFC hdfc= new HDFC();
		hdfc.loan();
		hdfc.credit();
		hdfc.debit();
		hdfc.funds();
		
	//	HDFC h=(HDFC) new Bank();  //compilation error 
		
		Bank b = new HDFC();    //funds will not be accessed from bank reference variable as it is not a pert of bank class
		b.loan();
		b.credit();
		b.debit();
		
		
		
		BMW b1= new BMW();
		b1.start();
		b1.start();
		b1.refuel();
		b1.fuel();
		
		Car c= new BMW();   //dynamic polymprphism
		c.start();
		c.refuel();
		c.stop();
	
		
	}

}
