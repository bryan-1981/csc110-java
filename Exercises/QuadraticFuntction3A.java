package Exercises;

import java.util.Scanner; //import the scanner class

public class QuadraticFuntction3A {

	public static void main(String[] args) {
		//collect + a,b,c 
		//then calculate x-vertex= -b/2a
		//y-vertex= 	
		//y-intercept=c
		Scanner inputScan = new Scanner(System.in);
		double  a,b,c;
		double  vx, vy, yin ;
		System.out.println("Enter a");
		a = inputScan.nextDouble();
		System.out.println("Enter b");
		b = inputScan.nextDouble();
		System.out.println("Enter c");
		c = inputScan.nextDouble();
	
		vx = -b / (2*a) ;
		System.out.println("The x-vertex is" + vx);
		
		vy = a * vx * vx + b *vx + c;
		System.out.println("The y-vertex is" + vy);
		
		yin = c;
		
		System.out.println("The y-intercept is" + yin);
		
		
		inputScan.close();
		

	}

}
