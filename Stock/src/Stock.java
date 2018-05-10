
import java.util.Scanner;

public class Stock {
	
	private String symbol="";
	private String name="";
	private double previousClosingPrize = 0;
	private double currentPrize = 0;
	
	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}
	
	public void setCurrentPrize(double currentPrize){
		this.currentPrize = currentPrize;
	}
	public double getCurrentPrize(){
		return currentPrize;
	}
	
	public void setPreviousClosingPrize(double pcp){
		this.previousClosingPrize = pcp;
	}
	public double getPreviousClosingPrize(){
		return previousClosingPrize;
	}
	
	
	public double getChangePercent(){
		double result = ( currentPrize / previousClosingPrize - 1 ) * 100;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Stock mystock = new Stock("ORC","OracleCorp");
		
		System.out.print("Previous Closing prize: ");
		mystock.setPreviousClosingPrize(input.nextDouble());
		
		System.out.print("Current prize: ");
		mystock.setCurrentPrize(input.nextDouble());
		
		System.out.printf("Prize change: %.2f%%", mystock.getChangePercent());
	}

}

