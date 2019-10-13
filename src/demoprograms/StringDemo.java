package demoprograms;


class A{
	
	public void method() {
	
	System.out.println("I'm in A");
}
	public void a() {
		System.out.println("a");
	}
}

class B extends A{
	
	public void method() {
	
	System.out.println("I'm in B");
	
}
	public void b() {
		System.out.println("b");
	}
	
	}



public class StringDemo extends B {
	
	/*public void method() {
		
		System.out.println("I'm in main class");
	}*/
	  
	public void m() {
		System.out.println("m");
	}
	   
	    public static void main (String args[])   
	    {  
	    	B b = new StringDemo();
	    	b.method();    // I m in mainn class
	    
	    
	    	
	    	StringDemo s = new StringDemo();
	    	s.method(); 
	    	// I m in main calss
	    	
	    	
	    	A a = new B();
	    	a.method();       // I m in B
	    	
	    	A a1 = new A();
	    	a1.method();        // I m in A
	    	
	    	B b1 = new B();
	    	b1.method();    // I in B
	       
	    }  
	  
	
	

}
