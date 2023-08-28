public class Armstron
 {
   public static void main(String[]args)
    {
       int num = 153;
       String str= "" + num;
       int len = str.length();
       AmstrongNumber(num,len);
    }
    public static void AmstrongNumber(int num, int len)
     {
       int sum = 0;
       int num1 = num;
       while ( num1 > 0){
       int rem = num1 % 10;
       sum += Math.pow(rem,len);
       num1 /= 10;
     }
      if(sum == num1)
       {
         System.out.println(num1+"amstrong Number");
       }
       else 
       {
         System.out.println(num1+"not amstrong number");
       }
    }
}
