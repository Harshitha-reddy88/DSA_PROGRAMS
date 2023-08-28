public class Main
{
	public static void main(String[] args)
	{
		int[] arr={1,2,4,1,2,4,8};
		int[] target=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			target[arr[i]]+=1;
		}
		for(int j=0;j<target.length;j++)
		{
			if(target[j]>0)
			{
				System.out.println(j+" " +"=>"+" "+target[j]);
			}
		}


	}
}
