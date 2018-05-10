package hw3;

import java.util.Scanner;

public class Hw3File {

	public static void hw4_15(){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Please enter an Uppercase letter: ");
		
		String s = input.nextLine();
		char ch = s.charAt(0);
		
		int number=0;
		
		if(ch == 'A' || ch == 'B' || ch == 'C' )
			number =2;
		else if(ch == 'D' || ch == 'E' || ch == 'F' )
			number =3;
		else if(ch == 'G' || ch == 'H' || ch == 'I' )
			number =4;
		else if(ch == 'J' || ch == 'K' || ch == 'L' )
			number =5;
		else if(ch == 'M' || ch == 'N' || ch == 'O' )
			number =6;
		else if(ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' )
			number =7;
		else if(ch == 'T' || ch == 'U' || ch == 'V' )
			number =8;
		else if(ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z' )
			number =9;
		
		System.out.println("The corresponding number is " + number);
		
	}
	
	public static void hw4_17(){

		Scanner input = new Scanner (System.in);
				
				System.out.print("Enter a year: ");
				int year = input.nextInt();
				
				System.out.print("Enter a month: ");
				String month = input.next();
				
				
				int numberOfDays = 0;
				
				switch(month){
				case "Jan":
					numberOfDays = 31;
					break;
				case "Feb":
					numberOfDays = 28;
					break;
				case "Mar":
					numberOfDays = 31;
					break;
				case "Apr":
					numberOfDays = 30;
					break;
				case "May":
					numberOfDays = 31;
					break;
				case "Jun":
					numberOfDays = 30;
					break;
				case "Jul":
					numberOfDays = 31;
					break;
				case "Aug":
					numberOfDays = 31;
					break;
				case "Sep":
					numberOfDays = 30;
					break;
				case "Oct":
					numberOfDays = 31;
					break;
				case "Nov":
					numberOfDays = 30;
					break;
				case "Dec":
					numberOfDays = 31;
					break;
				
				}
				
		        int leapYear = 0;
				
				if(((year%4==0)&&(year%100!= 0))||(year%400==0))
					leapYear = 1;	
					
				
				if(leapYear == 1 && numberOfDays == 28){
					numberOfDays = 29;
					}
				
				
				System.out.println(month + " " + year + " " + "has " + numberOfDays + " days. ");
				
				
			}
	
	public static void hw4_21(){

		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a SSN: ");
		String s = input.nextLine();
		
		int validity = 1;
		
		if(s.length() == 11){
			if(s.charAt(0) == '-' || s.charAt(1) == '-' || s.charAt(2) == '-' )
				validity = 0;
			else if(s.charAt(4) == '-' || s.charAt(5) == '-')
				validity = 0;
			else if(s.charAt(7) == '-' || s.charAt(8) == '-' || s.charAt(9) == '-' || s.charAt(10) == '-' )
				validity = 0;
			else if(s.charAt(3) != '-' || s.charAt(6) != '-')
				validity = 0;
			}
		else {
			validity = 0;
		}
		
		if(validity == 1)
			System.out.println(s + " is a valid social security number.");
		else
			System.out.println(s + " is an invalid social security number.");
	}
	
	public static void hw4_24(){
		Scanner input = new Scanner(System.in);
        
		System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
		 
        String temp;
        if (city1.compareTo(city2) > 0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if (city2.compareTo(city3) > 0){
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if (city1.compareTo(city2) > 0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hw4_15();
		
		hw4_17();
		
		hw4_21();
		hw4_24();
		}

}
