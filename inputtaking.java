import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       System.out.print("enter the number:");
       int num=input.nextInt();
       System.out.println(num);
       System.out.println(((Object)num).getClass().getSimpleName());
    }
 }
