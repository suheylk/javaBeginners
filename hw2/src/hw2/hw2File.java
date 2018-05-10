package hw2;

import java.util.Scanner;

public class hw2File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hw2.6
		/*Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		
		int number = input.nextInt();
		
		int thirdDigit  = number % 10;
		int secondDigit = (number / 10) % 10;
		int firstDigit  = number/100;
	
		int sum = firstDigit + secondDigit + thirdDigit;
		System.out.println("The sum of the digits is " + sum);*/
		
		//hw 2.8
		/*Scanner input = new Scanner (System.in);
				
		long clock = System.currentTimeMillis();
				
		int seconds = (int)(clock / 1000);
		int minutes = (int)(seconds / 60);
		int hours = (int)(minutes / 60);
			
		seconds = seconds % 60;
		minutes = minutes % 60;
		hours = hours % 24;
				
		System.out.print("Enter the time zone offset to GMT: ");
				
		int timeZoneOffset = input.nextInt();
			
		hours = (hours + timeZoneOffset) % 24;
				
		System.out.println("The current time is:" + hours + ":" + minutes + ":" + seconds);*/
		
		// hw2.13
		/*Scanner input = new Scanner (System.in);
				
		double firstM, secondM, thirdM, fourthM, fifthM, sixthM;
		double interestM = 1.00417;
				
		System.out.print("Enter the monthly saving amount: ");
				
		double monthlySaving = input.nextDouble();
				
		firstM = monthlySaving * interestM;
				
		secondM = (monthlySaving + firstM) * interestM;
		secondM = (double)((int)(secondM *1000))/1000; 
			
		thirdM = (monthlySaving + secondM) * interestM;
		thirdM = (double)((int)(thirdM *1000))/1000; 
				
		fourthM = (monthlySaving + thirdM) * interestM;
		fourthM = (double)((int)(fourthM *1000))/1000; 
				
		fifthM = (monthlySaving + fourthM) * interestM;
		fifthM = (double)((int)(fifthM *1000))/1000; 
				
		sixthM = (monthlySaving + fifthM) * interestM;
		sixthM = (double)((int)(sixthM *1000))/1000; 
				
		System.out.println("After the six month, the account value is $" + sixthM);*/
				
				
				
		//hw 2.23
		/*Scanner input = new Scanner (System.in);
				
				
		System.out.print("Enter the driving distance:");
		double drivingDistance = input.nextDouble();
				
		System.out.print("Enter miles per gallon:");
		double milesPerGallon = input.nextDouble();
				
		System.out.print("Enter price per gallon:");
		double pricePerGallon = input.nextDouble();
				
		double costOfLiving = (drivingDistance / milesPerGallon) * pricePerGallon;
		costOfLiving = (double)((int)(costOfLiving *100))/100;
						
		System.out.println("The cost of living is $" + costOfLiving);*/
				
				
				
		//hw3.4
		/*Scanner input = new Scanner (System.in);
				
		String month;
				
		int generatedNumber = (int)(Math.random()*12) + 1;
				
		switch (generatedNumber){
				
		case 1: month = "january";
				break;
		case 2: month = "February";
				break;
		case 3: month = "March";
				break;
		case 4: month = "April";
				break;
		case 5: month = "May";
				break;
		case 6: month = "June";
				break;		
		case 7: month = "july";
				break;
		case 8: month = "August";
				break;
		case 9: month = "September";
				break;
		case 10: month = "October";
				break;
		case 11: month = "November";
				break;
		case 12: month = "December";
				break;
		default: month = "yok";
				}
				
		System.out.println("Randomly selected month is " + month);*/
				
				
				
		//hw3.33
		/*Scanner input = new Scanner (System.in);
				
		double weight1, weight2, price1, price2;
				
		System.out.print("Enter weight and prize for package 1: ");
		weight1 = input.nextDouble();
		price1  = input.nextDouble();
				
		System.out.print("Enter weight and prize for package 2: ");
		weight2 = input.nextDouble();
		price2  = input.nextDouble();
				
		if(price1 / weight1 < price2 / weight2 )
			System.out.println("Package 1 has a better price.");
		else if(price2 / weight2 < price1 / weight1 )
			System.out.println("Package 2 has a better price.");
			else 
		System.out.println("Two packages have the same prices.");*/


	}

}
