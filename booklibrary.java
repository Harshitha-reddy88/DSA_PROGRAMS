import java.io.File;
import java.nio.file.*;
class Main{
	public static String[] str;
	public static void main(String[] args)
	{
		str = libraryFinding("/home/harshitha/Desktop/library/library_1");
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		//System.out.println(bookFinding("book2.pdf"));
		//System.out.println(moveFiles("book3.pdf","/home/harshitha/Desktop/library/library_1","/home/harshitha/Desktop/library/harshitha"));
		borrow("book4.pdf", "harshitha");	
		
	}
	public static String[] libraryFinding(String libraryDirectory)
	{
		File directorypath=new File (libraryDirectory);
		return directorypath.list();
	}
	public static boolean bookFinding(String book)
	{
		String[] arrbooks= libraryFinding("/home/harshitha/Desktop/library/library_1");
		for(int i=0;i<arrbooks.length;i++)
		{
			if(arrbooks[i].equals(book))
			{
				return true;
			}
		}
		return false;
	}
	public static boolean moveFiles(String bookName,String sourseofBook,String destinationOfBook)
	{
		String source=sourseofBook+"/"+bookName;
		String moveDestination=destinationOfBook+"/"+bookName;
		try
		{
			
			Path sourceDir=Paths.get(source);
			Path moveDes=Paths.get(moveDestination);
			Files.move(sourceDir,moveDes);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	public static boolean borrow(String bookName,String borrowerName)
        {
    		String borrowerDirName = "/home/harshitha/Desktop/library/library_1" + borrowerName;
    	
    		if(bookFinding(bookName))
    		{
    			moveFiles(bookName,"/home/harshitha/Desktop/library/library_1", borrowerDirName);
  			System.out.println("borrowed");
  			return true;
    		}
    		else
    		{
    			System.out.println(bookName + " not available in the library");
    			return false;
    		}
    	}
    	public static boolean returning(String bookName,String borrowerName)
        {
    		String borrowerDirName = " + borrowerName;
    	
    		if(bookreturning(bookName))
    		{
    			moveFiles(bookName,borrowerDirName,"/home/harshitha/Desktop/library/library_1");
  			System.out.println("retuned successfully");
  			return true;
    		}
    		else
    		{
    			System.out.println(bookName + " not available");
    			return false;
    		}
    	}
    		
    			
}
