public class Main
{
	public static void main(String[] args)
	{
		int num=5;
		for(int j=0;j<=num;j++)
		{
			for(int i=0;i<=num;i++)
			{
				if(i==0 || j==0)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
