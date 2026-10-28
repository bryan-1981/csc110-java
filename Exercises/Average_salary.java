package Exercises;

public class Average_salary {

	public static void main(String[] args) {
	//Decliration of variables
		double salaryNew, salaryOld, yearNew, yearOld;
		double avgsalary;
		
		//initialize Variables
		yearNew=2025;
		yearOld=2020;
		salaryNew=107000;
		salaryOld=91000;
		
		// Process Data
		
		avgsalary=(salaryNew-salaryOld)/(yearNew-yearOld);
		
		//output data
		System.out.println("the average change in salary is "+avgsalary);
		
	}

}
