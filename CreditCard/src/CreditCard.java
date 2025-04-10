import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class CreditCard
	{
	static int total = 0;
	static ArrayList <Long> cardList = new ArrayList<>();

		public static void main(String[] args) throws IOException
			{
				TextFile.readCards();
				for(int q = 0; q < cardList.size(); q++ )
					{
						total = 0;
						doubleDigits();
						validateCard();
					}
				

			}
		
		public static void doubleDigits()
		{
			
			//ArrayList <Integer> cardList = {5,4,2,4,1,8,0,1,2,3,4,5,6,7,8,9};
			
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
			 }
			 else
			 {
				 realCard = false;
			 }
			 System.out.print(realCard);
			  
		 }
			
	}
