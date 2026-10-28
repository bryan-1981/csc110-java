package Exercises;

public class BookstoreCheckout {

	public static void main(String[] args) {
		//decleration of variables
		//and initialize what we know
		int quantity = 3;
		double price = 25;
		double discountRate = 0.1;
		double discount;
		double subTotal;
		double total;
		String title = "Java: An Introduction";
		//pt.2 data processing
		subTotal = quantity * price;
		discount = subTotal * discountRate;
		total = subTotal - discount;
		//pt.3. output
		System.out.println("\tCAMPUS BOOKS     ");	
		System.out.println("Title:    \t" + title);
		System.out.println("Quantity:\t " + quantity);
		System.out.println("Subtotal:\t $" + subTotal);
		System.out.println("Discount:\t $" + -discount);
		System.out.println("Total:   \t $" + total);
		
	}

}
