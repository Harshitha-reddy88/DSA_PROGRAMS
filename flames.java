class Flames
{
	public static void main(String[] args)
	{
		String str1="harshi";
		String str2="kavya";
		char[] str1Array = str1.toCharArray();
		//char[] str2Array = str2.toCharArray();
		System.out.println(flamesGame(str1Array,str2Array));	
	}
	public static int flamesGame(char[] str1Array,char[] str2Array)
	{
		int countDuplicates = 0;
		for(int i=0;i<str1Array.length;i++)
		{
			for(int j=0;j<str2Array.length;j++)
			{
				if(str1Array[i] == str2Array[j] && (str1Array[i]!= '!' ))
				{
					countDuplicates = countDuplicates + 2; 
					str1Array[i] = '!';
					str2Array[j] = '!';
				}
			}
		}
		int x=str1Array.length+str2Array.length-countDuplicates;
		return x;
		String str="flames";
		
				
	}	
}
