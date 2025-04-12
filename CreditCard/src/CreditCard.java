import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCard
	{
	
	static ArrayList <Long> cardList = new ArrayList<>();
	static int total = 0;
	static int counter = 0;

		public static void main(String[] args) throws IOException
			{
				readCards();
				for(Long credit: cardList)
				{
					int total = 0;
					doubleDigits();
					validateCard();
					System.out.println();
				}
				System.out.print("There are " + counter + " valid card numbers!");
					
			}
				

			
		public static void readCards() throws IOException 
		{
			Scanner myFile = new Scanner(new File("Cards"));
					
		
			while(myFile.hasNext())
				{
					String cardNumber = myFile.nextLine();
					long number = Long.parseLong(cardNumber);
					cardList.add(number);
					
				}
		}
		
		
		public static void doubleDigits()
		{
			long value;
			
			
			for(int i = 0; i < cardList.size(); i+=2)
			{
					value = cardList.get(i)*2;
					cardList.set(i, value);
					
					
					if(cardList.get(i) > 9)
					{
						long sum = 0;
						String cardString = String.valueOf(cardList.get(i));
						for(int s = 0; s < cardString.length(); s++)
						{
							sum += Integer.parseInt(String.valueOf(cardString.charAt(s)));
						
						}
						cardList.set(i,  sum);
					}
				
			}
			//System.out.print(" ");
			for(long nums: cardList)
				{
					total += nums;
				}
			System.out.print("");
			
		}
		 public static void validateCard()
		 {
			 boolean realCard = false;
			 
			
			if(total % 10 == 0)
			 {
				 realCard = true;
				 counter++;
			 }
			 else
			 {
				 realCard = false;
			 }
			 System.out.print(realCard);
			  
		 }
			
	}
