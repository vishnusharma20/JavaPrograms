package demoprograms;

import java.util.Stack;

public class StackProgram {

	 
	 public static void main(String[] args) {
		 
		// StackProgram sp= new StackProgram();
		 System.out.println(StackProgram.checkBP("(()"));
	/* String checkBalancedExpr1=checkBalancedParentesis("a*(b+c)-(d*e)");
	 System.out.println("a*(b+c)-(d*e) : "+checkBalancedExpr1);
	 String checkBalancedExpr2=checkBalancedParentesis("(a*(b-c)*{d+e}");
	 System.out.println("(a*(b-c)*{d+e} : "+checkBalancedExpr2);
	 }
	 public static String checkBalancedParentesis(String expr)
	 {
	 if (expr.isEmpty())
	 return "Balanced";
	 
	 Stack<Character> stack = new Stack<Character>();
	 for (int i = 0; i < expr.length(); i++)
	 {
	 char current = expr.charAt(i);
	 if (current == '{' || current == '(' || current == '[')
	 {
	 stack.push(current);
	 }
	 if (current == '}' || current == ')' || current == ']')
	 {
	 if (stack.isEmpty())
	 return "Not Balanced";
	 char last = stack.peek();
	 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	 stack.pop();
	 else 
	 return "Not Balanced";
	 }
	 }
	 return stack.isEmpty()?"Balanced":"Not Balanced";*/
	 }
	 
	 public static String checkBP(String bracket)
	 {	 
		 //String bracket="((())";
		 
		 if(bracket.isEmpty()) {
			 return "Balanced";
		 }
		 
		 Stack<Character> st= new Stack<Character>();
		 
		 for(int i=0;i<bracket.length();i++)
		 {
		 char c = bracket.charAt(i);
		 if(c=='(')
		 {
			st.push(c); 
		 }
		 if(c==')')
		 	{
			 if(st.isEmpty())
			 {
				 return "Not balanced";
			 }
			 
			 char l=st.peek();
			 if(c==')'&&l=='(') 
			 {
				 st.pop();
			 }
			 else
			 {
				 return "Not Balanced";
			 }
		 }		
		 }
		 return st.isEmpty()?"Balanced":"Not Balanced";
		 
	 }
	 
}

