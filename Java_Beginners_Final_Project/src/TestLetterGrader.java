public class TestLetterGrader {
	public static void main(String[] args) {
		if (args.length < 2) {  // test if user enters two valid file names. give suitable messages
			System.out.println("Usage: Java TestLetterGrader inputFile outputFile");
			System.exit(1);
		} else {
			System.out.println("Letter grade has been calculated for students listed in input file " + args[0]
					+ " and written to output file " + args[1] + "\n");
		}

		LetterGrader letterGrader = new LetterGrader(args[0], args[1]); // creating a letterGrader object

		letterGrader.openInputFile();  // open input file
		letterGrader.readScores();     // read scores from input file 
		letterGrader.calculateScores(); // makes all calculations
		letterGrader.printGrade();      // write to output file
		letterGrader.displayAverages(); // display scores
	}

}
