package demo;


class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String s) {
		
		super(s);
	}
}

public class CustomException {
	
	static void validateAge(int age) throws InvalidAgeException{
		
		if(age < 18) {
			throw new  InvalidAgeException("Not valid");
		}
		else {
			System.out.println("valid");
		}
	}
	
	
	
	public static void main(String[] args)  {
		try {
		validateAge(10);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}


}

