import java.util.*;
import java.io.*;

public class LetterGrader {
	private Integer[] minimumScores;        // This is to store minimum scores
	private Integer[] maximumScores;        // This is to store maximum scores
	private Double[] totalScores;  			// This is to store total scores
	
	private String inputFileN;
	private String outputFileN;          // These are for storing file names
	
	private File inputFile;
	private File outputFile;                // These are to store files
	
	private ArrayList<String> lines;        // ArrayList is to store each line
	private ArrayList<String[]> results;    // ArrayList is to store data for output file
	
	private final int DATA_SIZE = 8;
	
	private final Double[] ratio = { 0.0, 0.1, 0.1, 0.1, 0.1, 0.20, 0.15, 0.25 };
	
	public LetterGrader(String inputFile, String outputFile) {   // Class constructor
		inputFileN = inputFile;
		outputFileN = outputFile;
	}
	public void openInputFile() {   // This is for opening input file
		inputFile = new File(inputFileN);
		if (!inputFile.exists()) {  
			System.out.println("Input file " + inputFileN + " does not exist!"); // warn the user if file does not exist
			System.exit(2);
		}
	}
	public void readScores() {   // This function is for reading scores from file
		try {
			Scanner input = new Scanner(inputFile);
			lines = new ArrayList<String>();
			while (input.hasNextLine()) {
				lines.add(input.nextLine());     // adding each line to the ArrayList
			}
			input.close();
		} catch (IOException e) {  
			System.out.println("Error reading from input file: " + inputFileN); // warn the user if error occurs 
		}
	}
	public void calculateScores() {         // This function is for calculating scores
		results = new ArrayList<String[]>(); 
		String[] studentData;
		totalScores = new Double[DATA_SIZE]; 
		minimumScores = new Integer[DATA_SIZE];
		maximumScores = new Integer[DATA_SIZE];
	
		for (int i = 0; i < DATA_SIZE; i++) {
			minimumScores[i] = Integer.MAX_VALUE;
			maximumScores[i] = Integer.MIN_VALUE;
			totalScores[i] = 0.0;  
		}
		for (int i = 0; i < lines.size(); i++) {   // read data line by line 
			studentData = lines.get(i).split(",");  
			Double finalScore = 0.0;                
			char letterScore;                         
			int examScore;
			
			for (int j = 1; j < DATA_SIZE; j++) { 
				examScore = Integer.parseInt(studentData[j].replaceAll("\\s", ""));
				finalScore 	   = finalScore + examScore * ratio[j];
				totalScores[j] = totalScores[j] +  examScore;
				if (examScore > maximumScores[j]) {       
					maximumScores[j] = examScore;
				}
				else if (examScore < minimumScores[j]) {       
					minimumScores[j] = examScore;
				}
			}
			if (finalScore >= 90) {                // determine letter grade
				letterScore = 'A';
			} else if (finalScore >= 80) {
				letterScore = 'B';
			} else if (finalScore >= 70) {
				letterScore = 'C';
			} else if (finalScore >= 60) {
				letterScore = 'D';
			} else {
				letterScore = 'F';
			}
			String[] myString = { studentData[0], Character.toString(letterScore) }; 
			results.add(myString); 
		}
	}
	public void printGrade() {  
		outputFile = new File(outputFileN);  
		try {
			PrintWriter output = new PrintWriter(outputFile);
			String[] outputString = new String[results.size()];   // string array for output file

			for (int i = 0; i < results.size(); i++) {
				String[] nameAndGrade = new String[2];
				nameAndGrade = results.get(i);
				outputString[i] = String.format("%-30s:%s", nameAndGrade[0], nameAndGrade[1]); 
			}
			Arrays.sort(outputString);    // sort the array
			for (int i = 0; i < results.size(); i++) {
				output.println(outputString[i]);   
			}
			output.close();            
		} catch (IOException e) {
			System.out.println("Error writing to output file: " + outputFileN); // warns user if error occurs

		}
	}
	public void displayAverages() { // function displays the average, minimum and maximum values 
		System.out.println("Here is the class averages:\n"); 
		System.out.println("                Q1          Q2      Q3      Q4    MidI   MidII   Final");
		System.out.print("Average:     ");
		for (int i = 1; i < DATA_SIZE; i++)
			System.out.printf("%.3f\t", totalScores[i] / lines.size());
		System.out.println("");
		System.out.print("Minimum:     ");
		for (int i = 1; i < DATA_SIZE; i++)
			System.out.printf("%6d\t", minimumScores[i]);
		System.out.println("");
		System.out.print("Maximum:     ");
		for (int i = 1; i < DATA_SIZE; i++)
			System.out.printf("%6d\t", maximumScores[i]);
	}
	

}
	
