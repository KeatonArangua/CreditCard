import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class TextFile
	{
	static  ArrayList <Long> cardList = new ArrayList<>();
		public static void readCards() throws IOException
		{
			
				
				
				Scanner myFile = new Scanner(new File("Cards"));
				
	
		while(myFile.hasNext())
			{
				String cardNumber = myFile.nextLine();
				long number = Long.parseLong(cardNumber);
				cardList.add(number);
				
			}
//		for(int i = 0; i < cardList.size(); i++)
//			{
//				System.out.println(cardList.get(i));
//			}
		}
		
		
		
		
		
		
	}
