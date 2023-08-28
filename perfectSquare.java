/*public class Main
{
	public static void main(String[] args)
	{
		int num=49;
		
		for(int i=1;i<=num/2;i++)
		{
			if(i*i == num)
			{
				System.out.println(" perfect");
				return;
			}
			
		}
		
		System.out.println("not perfect");
	}
	
	
}*/

public class Main
{
	public static void main(String[] args)
	{
		int num=7;
		for(int i=1;i*i<=num;i++)
		{
			if(num % i==0 && num / i==i)
			{
				System.out.println("perfect");
				return;
			}
		}
		System.out.println("not perfect");
	}
}


