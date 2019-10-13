package demo;

class Calculate{
	
	public void add() {
		System.out.println("add in parent class");
	}
}


class Math extends Calculate{
	
	public void sum() {
		System.out.println("sum in child class");
	}
	
	@Override
	public void add() {
		System.out.println("add in child class");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Calculate c= new Math();   //sum is not present in calculate class so can not call
		c.add();
		
		Calculate c1 = new  Calculate();  
		c1.add();
		
		
		Math m = new Math();
		m.add();
		m.sum();
		
		
		

}
}
