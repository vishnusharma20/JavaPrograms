package demo;

class Hi extends Thread{
	
	public synchronized void run() 
	{
	for(int i=1; i<=5;i++)
	{
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName());
	}
	}	
	
}

class Hello extends Thread{
	public synchronized void run() 
	{
	for(int i=1; i<=5;i++)
	{
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}

public class Therdingdemo {

	public static void main(String[] args) throws InterruptedException {
		
		Hi obj1= new Hi();
		Hello obj2 = new Hello();
		obj1.interrupt();
		
	
		obj1.start();
		obj2.start();
		/*obj1.run();
		obj2.run();*/

	}

}
