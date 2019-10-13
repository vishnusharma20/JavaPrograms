package demoprograms;

class A1{
	
	void sum(int a) {
		System.out.println("Base class with integrer"+ a);
	}
	
	void sum(double a) {
		System.out.println("Base class with double"+a);
	}
}

class B1 extends A1{
	
	@Override
	void sum(double a) {
		System.out.println("Derived class with double"+a);
	}
}


public class Overloading {
	
	/*public void sum(int a, double b) {
		System.out.println("a is invoked");
		
	}
	
	public void sum(double a, int b) {
		System.out.println("b is invoked");
	}*/

	public static void main(String[] args) {
		
		new A1().sum(10L);
		new B1().sum(10L);
		new B1().sum(10);

	}

}
