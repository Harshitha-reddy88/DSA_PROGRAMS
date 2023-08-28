 import java.io.*;
import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
 	String masterData = readFileData("conquorer.txt");
 	returnFirstSearchResult("Dhoni", masterData);  
 	//functionImageUrlsArray("<img scr=" ,results);
 	
  }
  
  public static void returnFirstSearchResult(String keyword, String crawledData)
  {
  	String[] results = crawledData.split(keyword);
  	
  	
  	
  	
  	for (int i=0; i < results.length; i++)
  	{
  		
  		GettingImg("<img src=" ,results[i]);
  		try
  		{
  			Thread.sleep(3000);
  		}
  		
  		catch(Exception e)
  		{
  		}	
  	}	
  }
  
  
  public static void GettingImg(String img, String tag)
  {
  	
  	String[] imgUrls = tag.split(img);

  	
  	for (int i=0; i < imgUrls.length; i++)
  	{
  		
  		seperatingTheLinks("alt=", imgUrls[i]);
  		
  		try
  		{
  			Thread.sleep(3000);
  		}
  		
  		catch(Exception e)
  		{
  		}	
  	}	
  }
  
  public static void seperatingTheLinks(String img,String tag)
  {
  	String[] imgLinks= tag.split(img);
  	System.out.println("*********************************************************************************************");
  	System.out.println(imgLinks[0]);
  	
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
