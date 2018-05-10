package hw4;

import java.util.Scanner;

public class Hw4File {
	
public static int reverse(int number){
		
		int reverseN = 0;
		while( number != 0){
			 
			 reverseN *= 10;
			 reverseN += number % 10;
			 number /= 10;
		}
		return reverseN;	
	}
	
	public static boolean isPalindrome(int number){
		
		boolean result = false;
		if (number == reverse(number)){
			result = true;
		}
		return result;
	}
	
	public static void hw6_3(){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer to test if it is a palindrome:");
		number = input.nextInt(); 
		
		if(isPalindrome(number) == true)
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrome");
	}
	 
	public static void displayPattern(int n){

	  for(int i=1; i<=n; i++){
		  for(int j=n-1; j>=i; j--){
			  System.out.print(" ");  
		  }
		  for(int k=i; k>=1; k--){
			  System.out.print(k);
		  }
		  System.out.println("");
	  }  
  }
	
	public static void hw6_6(){
	  int lineNumber;
	  Scanner input = new Scanner(System.in);
	  System.out.print("Please enter a line number to display the pattern:");
	  lineNumber = input.nextInt(); 
	  
	  displayPattern(lineNumber);
	  }
	public static String convertMillis(long millis){
		
		String result="";
		long hour=0, minute=0, second=0;
		
		
		second = millis / 1000;
		minute = second / 60;
		hour = minute / 60;
		
		minute = minute % 60;
		second = second % 60;
		
		result = hour + ":" + minute + ":" + second;
		return result;
		
	}
	public static void hw6_25(){
		
		long miliseconds;
		String result="";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time in miliseconds to see hour:minute:second format:");
		miliseconds = input.nextLong();
		
		result = convertMillis(miliseconds);
		
		System.out.println("The result is " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hw6_3();
		hw6_6();
		hw6_25();
	}

}
