package Exercises;
import java.util.Random;
public class RandomNumbersDemo {

	public static void main(String[] args) {
		//creating new random object
		Random rand = new Random();
		//task 1 generate random number between 0 & 1
		int randomZeroOrOne = rand.nextInt(2);
		System.out.println("Random number between 0 and 1: " + randomZeroOrOne );
		
		//Task 2 generate random number between 1 and 6
		int randomOneToSix = rand.nextInt(6)+ 1; 
		System.out.println("Random number between 1 and 6: " + randomOneToSix);
		
		//task 3 generate random number between 10 and 99
		int randomTenToNinetyNine = rand.nextInt(90)+ 10;
		System.out.println("Random number between 10 and 99: " + randomTenToNinetyNine);
		
		//Task 4 generate random monetary value up to $99.99
		double randomMoney = rand.nextDouble() * 100;
		System.out.printf("Random monetary value: $%.2f\n", randomMoney);
	}

}
