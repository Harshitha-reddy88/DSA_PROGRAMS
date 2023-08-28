public class Main
{
	public static void main(String[] args)
	{
		int[] arr={1,5,3,8,9,0};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1 ;j<=arr.length-1;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("3rd largest element" +" "+ arr[arr.length-3]);
		System.out.println("2nd smallest element" +" "+arr[1]);
		
	}
}
