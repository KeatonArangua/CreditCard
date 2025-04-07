import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TextFile
	{

		public static void readCards() throws IOException
			{
			
				
				
				Scanner myFile = new Scanner(new File("Cards"));
				//ArrayList <Card> studentList = new ArrayList<Card>();
		
		while(myFile.hasNext())
			{
				String cardNumbers = myFile.nextLine();
				//System.out.println(cardNumbers);
			}
				
			}
		
		
		
		
		
	}
