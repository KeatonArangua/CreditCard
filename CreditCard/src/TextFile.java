import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class TextFile
	{

		public static void readCards() throws IOException
			{
			
				
				
				//Scanner myFile = new Scanner(new File("Cards"));
				ArrayList <Integer> cardList = new ArrayList<>();
				String filePath = "Cards";
		try(Scanner scanner = new Scanner(new File(filePath)))
		{
		while(scanner.hasNext())
			{
				cardList.add(scanner.nextInt());
			
			}		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found: " + e);
		}
		
		for(int i = 0; i < cardList.size(); i++)
		{
			System.out.println(cardList.get(i));
		}
		}
		
		
		
		
		
	}
