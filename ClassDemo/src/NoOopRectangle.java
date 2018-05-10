
import java.util.Scanner;

public class NoOopRectangle {

	public static double getArea(float ht, float wth){
		return ht * wth;
	}

	public static double getPerimeter(float ht, float wth){
		return 2 * (ht + wth);
	}
	
	public static void main(String [] args){
		System.out.println("Testing NoOopRectangle.");
		System.out.print("Please enter height and width separated by space: ");
		
		Scanner sc = new Scanner(System.in);
		float height = sc.nextFloat();
		float width = sc.nextFloat();
		
		double area = getArea(height, width);
		System.out.println("The area is: " + area);

		double perimeter = getPerimeter(height, width);
		System.out.println("The perimeter is: " + perimeter);
	}
	
}
