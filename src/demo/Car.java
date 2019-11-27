package demo;

public interface Car {
	
	//only abstarct method
	//100% abstraction
	//only prototype is defined without implementation
	//only final n static is alloweed
	final int wheel=4;
	
	public static void start(){
		System.out.println("Start in interface");
	}
	public void stop();
	public void refuel();
}

class BMW implements Car{

	
	public static void start() {
		System.out.println("start");
		
	}

	@Override
	public void stop() {
	
		System.out.println("stop");
	}

	@Override
	public void refuel() {
		System.out.println("refuel");
	}
	
	public void fuel() {
		System.out.println("fuel");
	}
	
}
