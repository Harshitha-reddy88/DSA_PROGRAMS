class code
{
    public static String str="Welcome to the JTBB bootcamp".toLowerCase();
    public static char[] arr=str.toCharArray();
    
    public static void main(String[] args)
     {
           ReverseSubString(0,arr.length-1,arr);
          
          int wordStart	= 0;
          int wordEnd = 0;
         
          ReverseSubString(0,arr.length-1,arr);
          
          while((wordEnd=functionWordEnd(wordStart,arr)) != -1)
          {
         	  System.out.println( wordStart + ";" + wordEnd);
         	  ReverseSubString( wordStart,wordEnd-1,arr );
         	  wordStart = wordEnd + 1;
          	  System.out.println(arr);
          }
     }
   
     public static int functionWordEnd(int start,char[] arr)
     {
          if(start >= arr.length)
          {
               return-1;
          }
          	 int wordEnd = start;
         	 while(wordEnd < arr.length && arr[wordEnd] != ' ')
          	{ 
          	    wordEnd++;
          	}
          	   return wordEnd; 
      	}
      public static void ReverseSubString( int start,int end, char[] arr )
      {
      
          if(arr == null)
          {
              return;
          }
          while(start <= end)
          {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
         
            
          }
      
       }
}

