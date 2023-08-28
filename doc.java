import java.io.*;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
 	String masterData = readFileData("conquorer.txt");
 	System.out.println(masterData.length());
 	returnFirstSearchResult("dhoni", masterData); 
  }
  
  public static void returnFirstSearchResult(String keyword, String crawledData)
  {
  	String[] results = crawledData.split(keyword);
  	
  	System.out.println("Found " + results.length + " Search Results");
  	
  	for (int i=0; i < results.length; i++)
  	{
  		System.out.println("Result #" + i + " : " + results[i]);
  		try
  		{
  			Thread.sleep(3000);
  		}
  		catch(Exception e)
  		{
  		}
  	}
  	
  	
  }
  
  public static String readFileData(String fileName)
  {
	String data = "";
	int lineCount = 0;
	
	try 
	{
		File myObj = new File(fileName);
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) 
		{
			lineCount++;
			data =  data + myReader.nextLine();
		}
		myReader.close();
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
	
	return data;
  }
}
