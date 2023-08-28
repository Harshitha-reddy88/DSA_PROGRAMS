public class armstrongnumber
{
	public static void main(String[] args)
	{
		
	int num = 6347;
        int armstrongNum = 0;
        
        String numString = "" + num;
        
        for (int i =0;i < numString.length(); i++ )
        {
            int chNum = numString.charAt(i) - '0';
            armstrongNum +=  java.lang.Math.pow(chNum,numString.length()); 
        }
        
        if(num == armstrongNum)
        {
            System.out.println("Armstrong Number" + num + ":" + armstrongNum);
        }
        else
        {
            System.out.println("Not an Armstrong Number"  + num + ":" + armstrongNum);
        }
	}


}
