public class Main
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3},{4,5,6},{8,9,0}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==0 || j==0 || i==arr.length-1 || j==arr.length-1)
				{
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
