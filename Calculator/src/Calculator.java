
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static int getUserChoice(Scanner input){ // this function gets user choice 
		int choice;
		do {
			try {	
				choice = input.nextInt();

				if (choice >=1 && choice <= 5 ){   // get input from user 
					break;
				} else {
					System.out.print("You have entered an invalid choice, please re-enter your choice between 1 and 5:");
					continue;   // if user entered invalid input, ask until valid input
				}
			} catch(final InputMismatchException e) {
				System.out.print("You have entered an invalid choice, please re-enter your choice between 1 and 5:");
				input.nextLine();  //if user did not enter an integer, ask until integer
				continue;
			}
		} while(true); 
		return choice; // this is the valid input
	}
	public static void getTwoFloats(float [] floatNumbers, Scanner input){
		do {
			try {
				floatNumbers[0] =input.nextFloat();
				floatNumbers[1] =input.nextFloat();   // get inputs from user
				input.nextLine();
				break;

			} catch(final InputMismatchException e){
				System.out.print("You have entered  invalid floats, please re-enter two floats: ");
				input.nextLine(); // if user did not enter a float, ask until valid float values
				continue;
			}	
		}while(true);
	}
	public static void printWelcomeMessage(){ // This function prints welcome message
		System.out.println("Welcome to <Suheyl Keskin's> Handy Calculator\n");
		System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit \n");
		System.out.print("What would you like to do? ");
	}
	public static void performOperation(float [] floatNumbers, Scanner input){ // This function performs the selected operation
		int userChoice = 0;
		while(userChoice != 5){ // loop until user selects 5 which means exit
			printWelcomeMessage();
			userChoice = getUserChoice(input);  // get user choice
			switch (userChoice) {
			case 1:  
				System.out.print("\nPlease enter two floats to add, separated by a space: ");
				getTwoFloats(floatNumbers, input); // get two floats from user
				System.out.printf("Result of adding %.2f and %.2f is %.2f \n", floatNumbers[0], floatNumbers[1], floatNumbers[0] + floatNumbers[1] ); // perform addition and print
				break;
			case 2:   
				System.out.print("\nPlease enter two floats to subtract(first minuend and second subtrahend), separated by a space: ");
				getTwoFloats(floatNumbers, input);
				System.out.printf("Result of subtracting %.2f and %.2f is %.2f \n", floatNumbers[0], floatNumbers[1], floatNumbers[0] - floatNumbers[1] );
				break;
			case 3:   
				System.out.print("\nPlease enter two floats to multiply, separated by a space: ");
				getTwoFloats(floatNumbers, input);
				System.out.printf("Result of multiplying %.2f and %.2f is %.2f \n", floatNumbers[0], floatNumbers[1], floatNumbers[0] * floatNumbers[1] );
				break;
			case 4:  
				System.out.print("\nPlease enter two floats to divide, separated by a space: ");
				getTwoFloats(floatNumbers, input); // get two floats from user
				while(floatNumbers[1] == 0){  // if second number is zero, get two floats again
					System.out.print("Second number cannot be zero, please re-enter two floats:");
					getTwoFloats(floatNumbers, input);	
				}
				System.out.printf("Result of dividing %.2f by %.2f is %.2f \n", floatNumbers[0], floatNumbers[1], floatNumbers[0] / floatNumbers[1] ); // perform division and print 
				break;
			}
			if (userChoice != 5 ){
				System.out.println("\nPress enter key to continue.....\n"); // Program will continue until exit
				input.nextLine();	
			}
		}
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		float[] floatNumbers =new float[2];  // declaration of float array with size 2

		performOperation(floatNumbers, input ); //this function takes float array and scanner object as a parameter and performs the operation

		System.out.println("\nThank you for using <Suheyl Keskin's> Handy calculator");
		input.close();   // close scanner
	}
}

