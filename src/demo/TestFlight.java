package demo;


abstract class person{
	
	String personId;
	String personName;
	
	person(String personId, String personName){
		this.personId=personId;
		this.personName=personName;
	}
	 abstract void display();
		 
	 
}

class Employee extends person{
	
	int empSalry;
	Employee(String personId, String personName, int empSalary) {
		super(personId, personName);
		
		this.empSalry=empSalary;
	}
	@Override
	void display() {
		
		System.out.println("Person id"+ super.personId);
		System.out.println("Person name" + super.personName);
		System.out.println("Employee salary"+ empSalry);
	}
	
}

class Student extends person{
	int marks;
	Student(String personId, String personName, int marks) {
		super(personId, personName);
		
		this.marks=marks;
	}

	@Override
	void display() {
		System.out.println("Person id"+ super.personId);
		System.out.println("Person name" + super.personName);
		System.out.println("Employee salary"+ marks);
		
	}
	
}

public class TestFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
