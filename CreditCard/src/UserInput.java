import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput
	{

		public static void main(String[] args)
			{
				System.out.println("Please input a 16 digit number!");
				Scanner scanner = new Scanner(System.in);
				Long cardNumber = scanner.nextLong();
				if(validateCard(cardNumber))
					{
						System.out.println("This is a potentially valid card number");
					}
				else
					{
						System.out.println("This is not a potentially valid card number");
					}

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
