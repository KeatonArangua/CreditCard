import java.io.IOException;

public class CreditCard
	{
	static int total = 0;

		public static void main(String[] args) throws IOException
			{
				//TextFile.readCards();
				doubleDigits();
				validateCard();

			}
		
		public static void doubleDigits()
		{
			
			int[] card = {5,4,2,4,1,8,0,1,2,3,4,5,6,7,8,9};
			int value;
			
			
			for(int i = 0; i < card.length; i+=2)
			{
					value = card[i]*2;
					System.out.print(value);
					card[i] = value;
					
					
					if(card[i] > 9)
					{
						int sum = 0;
						String cardString = String.valueOf(card[i]);
						for(int s = 0; s < cardString.length(); s++)
						{
							sum += Integer.parseInt(String.valueOf(cardString.charAt(s)));
						card[i] = sum;
						}
						
					}
				
			}
			System.out.print(" ");
			for(int k = 0; k < card.length; k++)
			{
				System.out.print(card[k]);
				total += card[k];
			}
			System.out.print(" ");
			
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
			 
			 }
			 System.out.print(realCard);
			  
		 }
			
	}
