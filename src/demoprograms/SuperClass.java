package demoprograms;

class Car{
	
	int cost;
	Car(int cost){               //constructor
		this.cost=cost;
		
	}
	

}

class Bike extends Car {
	
	String type;
	Bike(int cost, String type){
		
		
		super(cost);           //super and this must be the first to be invoked inside constructor
		this.type=type;
	
	}
}

public class SuperClass {

	public static void main(String[] args) {
		
		Car c = new Car(1000);
		Bike b = new Bike(1000, "apache");
		
		System.out.println( b.cost+""+ b.type);
		

	}

}
