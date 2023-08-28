public class Main
{
   public static void main(String[] args)
   {
      int x=2;
      String bag="";
      String bag1="";
      while(x>0)
      {
         bag=bag+x%2;
         x=x/2;
     }
      for(int i=0;i<bag.length();i++)
      {
        bag1=bag.charAt(i)+bag1;
      }
      System.out.println(bag1); 
   }
 }
