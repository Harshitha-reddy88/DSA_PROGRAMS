import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.io.FileWriter;

public class Temp2 {
    public static void main(String[] args) 
    {   
    
    String masterData = "";
        
        String[] cricketers = {"/home/harshitha/Desktop/library/library_1/book1.pdf","/home/harshitha/Desktop/library/library_1/book2.pdf","/home/harshitha/Desktop/library/library_1/book3.pdf","/home/harshitha/Desktop/library/library_1/book4.pdf"};
        for (int i=0; i < cricketers.length; i++)
        {
        	try
        	{
        		masterData = masterData + ContentOfWebsite(cricketers[i]); 	
        	}
        	catch(Exception e)
        	{
        		System.out.println(e.getMessage());
        	}
        }
       
     	writeDataToFile(masterData);   
        System.out.println(masterData.length());
        
        //writeDataToFile(data);
        writeDataToFile(masterData);
    }
    public static String ContentOfWebsite(String urlPath){
        String outLine = "";
        try {
            // get URL content
            
            String a = urlPath;
            URL url = new URL(a);
            URLConnection conn = url.openConnection();
 
            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                outLine += inputLine;
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    
    public static void writeDataToFile(String str)
    {
	try 
	{
		FileWriter myWriter = new FileWriter("conquorer.txt");
		myWriter.write(str);
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	} 
	catch (IOException e) 
	{
		System.out.println("An error occurred.");
		e.printStackTrace();
	}

    }
}
