package demo;

public class oppositeCase {

	public static void main(String[] args) {

		String str="ViSHnuUUUU";
		
		/*for(int i=0;i<str.length();i++) {
		Character c= str.charAt(i);
		if(Character.isLowerCase(c)) {
			System.out.print(Character.toUpperCase(c));
		}
		else {
			System.out.print(Character.toLowerCase(c));
		}
		}*/
		
		//get all uppercase in a strig
		

		for(int i=0;i<str.length();i++) {
		Character c= str.charAt(i);
		if(Character.isUpperCase(c)) {
			System.out.print(c);
		}
	}

}
}
