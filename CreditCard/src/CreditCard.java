import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCard
	{
	
	static ArrayList <Long> cardList = new ArrayList<>();
	static int counter = 0;

		public static void main(String[] args) throws IOException
			{
				readCards();
				for(Long credit: cardList)
				{
					if(validateCard(credit))
					{
						counter++;
						System.out.println("The card number " + credit + " is potentially valid!");
					}
					else
						{
							System.out.println("The card number " + credit + " is not potentially valid!");
						}
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
			myFile.close();
		}
		 public static boolean validateCard(Long cardNumber)
		 {
			 String cardStr = Long.toString(cardNumber);
			 int total = 0;
			 boolean doubleIt = false;
			 
			 for(int i = cardStr.length()-1; i >= 0; i--)
			 {
				 int digit = Character.getNumericValue(cardStr.charAt(i));
				 
				 if(doubleIt)
				 {
					 digit *=2;
					 
					 if(digit > 9)
					 {
						 digit -= 9;
					 }
				 }
				 
			total += digit;
			doubleIt = !doubleIt;
				 
			 }
			 
			
		return total % 10 == 0;
		}
			 
			  
}
			
	