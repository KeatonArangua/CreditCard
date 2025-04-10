import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class TextFile
	{

		public static void readCards() throws IOException
			{
			
				
				
				Scanner myFile = new Scanner(new File("Cards"));
				ArrayList <Integer> cardList = new ArrayList<>();
	
		while(myFile.hasNext())
			{
				String cardNumber = myFile.nextLine();
				int number = Integer.parseInt(cardNumber.trim());
				cardList.add(number);
				
			
			}		
		}
		
		
		
		
		
		
	}
