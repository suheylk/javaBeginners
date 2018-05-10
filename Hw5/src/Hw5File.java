package hw5;

import java.util.Scanner;
public class Hw5File {
	public static void hw7_7(){
		int[] myArray = new int[10];
		int randomNo ;
		for(int i =0; i< 100; i++){
			randomNo = (int)(Math.random() * 10);
			myArray[randomNo]++;
		}
		for(int i=0; i < myArray.length; i++){
			System.out.println("Number " + i + " appears " + myArray[i] + " times");
		}	
	}
	public static int indexOfSmallestElement(double[] array){
		int smallestIndex = array.length -1;
		double smallestElement= array[array.length-1];
		for(int i=array.length-1; i>=0 ; i--){
			if(array[i] <= smallestElement){
				smallestElement = array[i];
				smallestIndex = i;
			}
		}
		return smallestIndex;
	}
	public static void testhw7_10(){
		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease enter 10 numbers:");
		
		for (int i=0; i< array.length; i++){
			array[i] = input.nextDouble();
		}
		int smallestIndex = indexOfSmallestElement(array);
		
		System.out.println("Index of the smallest element is " + smallestIndex);
	}
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		 result[j] = list[i]; 
		}
		 return result;
	}
	public static void testhw7_12(){
		int[] list1 = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease enter 10 numbers to reverse: ");
		
		for(int i=0; i< list1.length; i++){
			list1[i]=input.nextInt();
		}
		 int[] list2 = reverse(list1);
		 
		 System.out.print("Reversed numbers are: ");
		 for(int i=0; i< list2.length; i++){
			 System.out.print(list2[i] + " ");
		 }	
	}
	public static void sortStudents(String[][] students ){
		
		int currentIndex;
		int currentMin;
		for(int i=0; i< students[1].length-1; i++){
			
			currentIndex = i;
			currentMin = new Integer(students[1][i]);
			String name = "";
			
			for(int k= i+1; k < students[1].length; k++ ){
				
				if(currentMin > Integer.parseInt(students[1][k])){
					currentMin = Integer.parseInt(students[1][k]);
					name = students[0][k];
					currentIndex = k;
				
				}
			}
			
			if(currentIndex != i) {
				students[1][currentIndex] = students[1][i];
				students[0][currentIndex] = students[0][i];
				students[0][i] = name;
				students[1][i] =Integer.toString(currentMin);
			}
		}
	}
	public static void hw7_17(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the number of students: ");
		int sc = input.nextInt();  //sc is a student count
		String[][] students = new String[2][sc];
		
		for(int i=0; i< students[1].length; i++){
			System.out.print("Enter student #"+ (i+1) + " name: "   );
			students[0][i] = input.next();
			System.out.print("Enter student #"+ (i+1) + " score: "   );
			students[1][i] = input.next();
		}
		
		sortStudents(students);
		for(int i= 0; i< students[1].length; i++){
			System.out.println("Student " + students[0][i] +"'s score is " + students[1][i]); 
			
		}
		
	}
	public static void bubleSort(double[] array){
		
		double dummy;
		for(int i=0; i< array.length; i++){
			for(int j=0; j<array.length -1; j++ ){
				
				if (array[j] < array[j+1]){
					dummy = array[j+1];
				    array[j+1] = array[j];
				    array[j] = dummy;
				}
				
			}
		}
		
	}
	public static void hw7_18(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nplease enter the size of the array: ");
		int size = input.nextInt();
		double[] array = new double[size];
		
		for (int i =0; i< array.length; i++){
			System.out.print("Please enter the element #" + (i+1) + ":");
			array[i] = input.nextDouble(); 
		}
		
		bubleSort(array);
		System.out.print("Sorted array is: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + "  "); 
			
		}
	}
	public static int[] merge(int[] list1, int[] list2){
		
		int[] array = new int[list1.length + list2.length];
		int j=0, k=0;
		for(int i=0; i< (list1.length + list2.length); i++){
			if(j<list1.length && k<list2.length){
				if (list1[j] < list2[k]){
					array[i] = list1[j];
					j++;
				} else {
					array[i] = list2[k];
					k++;
				}
			}else if (j == list1.length && k != list2.length ){
				array[i] = list2[k];
				k++;
			} else if (j != list1.length && k == list2.length){
				array[i] = list1[j];
				j++;
			}
		}	
		return array;
	}
	public static void hw7_31(){
		Scanner input= new Scanner(System.in);
		
		System.out.print("\nEnter the size of the first array: ");
		int size1 = input.nextInt();
		System.out.print("Enter the size of the second array: ");
		int size2 = input.nextInt();
		
		int[] list1 = new int[size1];
		int[] list2 = new int[size2];
		
		System.out.print("Enter the elements of the first array:");
		for(int i=0; i<list1.length; i++){
			list1[i] = input.nextInt();  
		}
		System.out.print("Enter the elements of the second array:");
		for(int i=0; i<list2.length; i++){
			list2[i] = input.nextInt();  
		}
		int[] array = new int[size1 + size2];
		array = merge(list1, list2);
		
		System.out.print("Elements of the merged array are: ");
		for(int i=0; i< array.length; i++){
			System.out.print(array[i]+ " ");
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hw7_7();
		testhw7_10();
		testhw7_12();
		hw7_17();
		hw7_18();
		hw7_31();		
	}	
	
}

