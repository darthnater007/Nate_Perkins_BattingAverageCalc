import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BattingAverageApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the  Batting Average Calculator App!\n"
				         + "It will be nice to pretend baseball is fun for a moment.");
		
		
		NumberFormat  decimal = new DecimalFormat("#0.000"); 
		
		String choice = "Y";
		int totalBases = 0;
		int batsWithBases = 0;
		while (choice.equalsIgnoreCase("Y")) 
		{
			int atBat = Console.getInt("Enter the number of time at Bat:  ", 0, 10);
			
			int[] bats = new int[atBat];
			
			System.out.println("\n0=out  1=single  2=double  3=triple  4=home \n");
			
			for(int b = 0 ; b < atBat ; b++){
				bats[b] = Console.getInt("Result for at bat " + (b+1) + ":  ", 0, 4);
				totalBases += bats[b];
				if(bats[b] > 0) batsWithBases++;
			}
			
			double batAvg = ((double) batsWithBases / atBat);
			double slugPercent = ((double) totalBases / atBat);
			
			
			
			System.out.println("\n Batting Average: "+ decimal.format(batAvg) + 
					           "\nSlugging Percent: " + decimal.format(slugPercent));
			
			Console.getString("\nAnother Player? (y/n):  ", "y", "n");
		}
		
		System.out.println("Bye!");
	}

}
