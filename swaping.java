
//by using extra memory

/*public class Main
{
	public static void main(String[] args)
	{
		int num=20;
		int num1=30;
		int temp=num;
		num=num1;
		num1=temp;
		System.out.println(num);
	}
}*/

public class Main
{
	public static void main(String[] args)
	{
		int num=10;
		int num1=20;
		
		System.out.println("before swaping"+" "+num+" "+num1);
		num=num+num1;
		num1=num-num1;
		num=num-num1;
		
		System.out.println("***********************");
		
		System.out.println("after swaping");
		System.out.println("num"+"="+num);
		System.out.println("num2"+"="+num1);
	}
}
