public class Main{
  public static void main(String[] args)
  {
 
  System.out.println(reverseString("Hello world how are you",""));
  } 
  public static String reverseString(String str,String bag){
  
   if(str==" ")
   {
     	System.out.println("str is empty");
   }
   for(int i=0;i<str.length();i++)
   	{
       		bag=str.charAt(i)+bag;
     	}
     	return bag;  
      }
      
   }
