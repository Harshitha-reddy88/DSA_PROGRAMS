public class Main
{
	public static void main(String[] args)
	{
		String str="madam";
		String str1="";
		String bag="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
				{
					bag="palindrome";
				}
				else
				{
					bag="not palindrome";
				}
			}
		}
		System.out.println(bag);
	}
}
