//YOUR CODE// 
 //Write a program to find the number of words without vowels
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner input =new Scanner(System.in);
	String str=input.nextLine();
	int wordStart=0;
	int previous=0;
	  int count=0;
	while(wordStart<str.length()){
		while(wordStart<str.length() && str.charAt(wordStart)!=' ')
		{
			wordStart++;
		}
		String temp=str.substring(previous,wordStart);
			if(isPalindrom(temp)==true)
			{
				count++;
			}
			wordStart=wordStart+1;
			previous=wordStart;
		
	}
	  System.out.println(count);
  }
	public static boolean isPalindrom(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				return false;
			}  	
		}
		return true;
	}
  
}
 
 //YOUR CODE ENDS// 
 
 
 //SOLUTION MENTIONED BELOW // 
 
 

 //SOLUTION ENDS//
