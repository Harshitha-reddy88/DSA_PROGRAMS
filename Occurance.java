public class Main
{
	public static void main(String[] args)
	{
		int num=114;
		int digit=4;
		System.out.println(digitCount(num,digit));
	}
	public static int digitCount(int num,int digit)
	{
		if(num==0)
		{
		   return 0;
		}
		else
		{
			int last=num % 10;
			if(last==digit)
			{
				return 1+digitCount(num /10 ,digit);
			}
			else
			{
				return digitCount(num / 10 ,digit);
			}
		}
	}
}

