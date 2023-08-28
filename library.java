import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.*;
class New
{
  // public static String 
   public static String[] str;
   
   public static void main(String[] args) 
    {  
    	//borrow("four.pdf", "durga"); 
    	System.out.println(Return("book1.pdf","harshitha")); 
    	Return("book1.pdf","harshitha")  
    }
    
    public static String[] getAllBooks(String directory)
    {
        File directoryPath = new File(directory);
        return directoryPath.list();
    }
    
    public static boolean isBookAvailable(String book, String dir)
    {
    	String[] books = getAllBooks("/home/harshitha/Desktop/library/library_1/harshitha" + dir);
    	
    	for(int i=0;i<books.length;i++)
    	{
    		if(books[i].equals(book))
    		{
    		   return true;
    		}
    	}
    	return false;
    }
    
    public static boolean moveBook(String bookName,String sourceDir,String destDir)
    {
    	String sourceBookFile = sourceDir+"/"+bookName;
    	String destBookFile = destDir+"/"+bookName;
    	
    	System.out.println(sourceBookFile);
    	System.out.println(destBookFile);
    	
    	try
    	{
    		Path source=Paths.get(sourceBookFile);
    		Path dest = Paths.get(destBookFile);
    		Files.move(source, dest);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	return false;
        }
        return true;
    }
    public static boolean borrow(String bookName,String borrowerName)
    {
    	String borrowerDirName = "/home/harshitha/Desktop/library/" + borrowerName;
    	
    	if(isBookAvailable(bookName, "books"))
    	{
    		moveBook(bookName,"/home/harshitha/Desktop/library/library_1/harshitha", borrowerDirName);
  		System.out.println("borrowed");
  		return true;
    	}
    	else
    	{
    		System.out.println(bookName + " not available in the library");
    		return false;
    	}
    }
    public static boolean Return(String bookName,String borrowerName)
    {
    	String borrowerDirName = "/home/jtbb/Desktop/Library/" + borrowerName;
    	
    	if(!isBookAvailable(bookName, "books") && isBookAvailable(bookName, "harshitha"))
    	{
    		moveBook(bookName,borrowerDirName,"/home/harshitha/Desktop/library/library_1/harshitha");
    		return true;
    	}
	else
	{
		System.out.println("Book is not available");
	}
    	return false;
    }
    
    
}
