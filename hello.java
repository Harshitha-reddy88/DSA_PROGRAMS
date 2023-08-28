public class Main
 {
 	public static void main(String[] args)
 	{
 	   int num=7;
 	   System.out.println(checkPrime(num));
 	}
 	public static String checkPrime(int num)
 	{
 	   int count=0;
 	   for(int i=0;i<=num;i++)
 	   {  
 	     if(num%i==0)
 	     {
 	       count++;
 	     }
 	   }
 	   if(count==2)
 	   {
 	      return "prime";
 	   }
 	   else
 	   {
 	     return "not a prime";
 	   }
        }
 	   
 }
