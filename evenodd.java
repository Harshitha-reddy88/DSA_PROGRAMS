public class Main
{
   public static void main(String[] args)
   {
      int num=8;
      System.out.println(checkEvenOrOdd(num));
   }
    public static String checkEvenOrOdd(int num)
    {
       if(num==0)
       {
          return "zero";
       }
       if(num%2==0)
       {
          return "even";
       }
       else
       {
         return "odd";
       }
    }
       
  }
       
