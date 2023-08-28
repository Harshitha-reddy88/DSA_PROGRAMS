public class Main{
	public static void main(String[] args)
	{
		String str1="harshiii";
		String str2="kavyaaa";
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
			}
		}
		int x=str1.length()+str2.length()-count;
		System.out.println(count);
	}
}





