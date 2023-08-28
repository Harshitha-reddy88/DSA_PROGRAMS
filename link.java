import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
 
public class Temp2 {
    public static void main(String[] args) {
        String urlPathName = "http://jericho.htmlparser.net/docs/index.html";
        String resultant = ContentOfWebsite(urlPathName);
       // System.out.println(resultant);
        //int startpoint=Temp2.findParagraphstart(0,urlPathName);
        //System.out.println(startpoint);
        System.out.println(resultant.length());
        int paragraphstart=Temp2.findParagraphstart(0,resultant);
        System.out.println(paragraphstart);
        int paragraphend=Temp2.findParagraphend(0,resultant);
        System.out.println(paragraphend);
        Temp2.printString(paragraphstart,paragraphend,resultant); 
        int paraStart = 0;
	int paraEnd = 0;
	int count=1;
	paraStart = findParagraphstart(0, resultant);
	paraEnd = findParagraphend(0, resultant);
	while (paraStart != -1 && paraEnd != -1)
	{
	        System.out.println(count++);
		printString(paraStart,paraEnd,resultant);
		paraStart=paraStart+3;
		paraEnd=paraEnd+4;
		paraStart = findParagraphstart(paraStart, resultant);
		paraEnd = findParagraphend(paraEnd, resultant);
	}
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
                outLine += inputLine.trim();
            }
            br.close();

        } catch (MalformedURLException e) { 
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outLine;
    }
    public static int findParagraphstart(int startpoint,String str)
    {
            while(startpoint<str.length()-2)
              {
                 if(str.charAt(startpoint)== '<' && str.charAt(startpoint+1)== 'a' )
                 {
                    return startpoint+2;
                 } 
                    startpoint++;
               }   
                  return -1;         
     }
     public static int findParagraphend(int end,String str)
     {
          while(end<str.length()-4)
              {
                 if( str.charAt(end)== '<'  && str.charAt(end+1)== '/' && str.charAt(end+2)== 'a' && str.charAt(end+3)== '>')
                 {
                    return end+4;
                 } 
                    end++;
             }
             return -1;
           
       }
       public static void printString(int start,int end,String str)
        {
          int i = 0;
      	for(i=start;i<end;i++)
      	{
      		if(str.charAt(i) == '"')
      	{
      		i++;
      		break;
      	}
      }
      
      boolean endOfTheQuote= false;
      
      while(endOfTheQuote != true)
      {
        if(str.charAt(i) == '"')
        {
        	endOfTheQuote = true;
	}
	else
	{
        	System.out.print(str.charAt(i));
        }
        
        i++;
      }
      System.out.println("");
        }  
}





