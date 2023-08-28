public class Main
{
	public static void main(String[] args)
	{
		int[][] arr={{1,2,3} , {4,5,6} , {7,8,9}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<=i;j++)
			{
				sum=sum+arr[i][j];
			}
		}
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i != j)
			{
				sum=sum+arr[i][j];
			}
			j++;
		}
		System.out.println(sum);
		
	}
}
