import java.util.Scanner;

public class FirstJavaFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine(); //gets entire line
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		
		String str1 = input.next(); //gets only next word 
		String str2 = input.next();
		String str3 = input.next();	
		System.out.println(str1 + str2 + str3);
	}

}
