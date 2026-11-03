	package Exercises;
	
	import java.util.Scanner;
	
	public class Equation_Checker_W11 {
	
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in); 
	    	
	    	final String CORRECT_ANSWER = "16";
	    	
	    	System.out.println("Solve for x. If there is no solution, enter dne. ");
	    	System.out.println("(x-3)/x - 5/8 = 3/x");
	    	System.out.print("Enter your answer: ");
	    	
	    	String userAnswer = scanner.nextLine(); // String so "dne" is allowed
	
	        if (userAnswer.equals(CORRECT_ANSWER)) { 
	        	System.out.println("Correct! x = 16");
	        } else {
	            System.out.println("Incorrect. Try again.");
	        }
	
	        scanner.close();
	    }
	}
	    	