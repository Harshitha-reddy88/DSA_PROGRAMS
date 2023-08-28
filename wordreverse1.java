class HelloWorld {
    public static String str="Shireesha is angry girl";
    public static char[] arr=str.toCharArray();
    
    public static void main(String[] args) {
        int wordStart=0;
        int wordEnd=0;
        reverseString(0,arr.length-1,arr);
        
         System.out.println(arr);
         while((wordEnd=findWord(wordStart, arr))!=-1)
         {
          System.out.println(wordStart + " : " + wordEnd);
          reverseString(wordStart,wordEnd - 1,arr);
          wordStart = wordEnd + 1;
          System.out.println(arr);
         }
     }
    
    public static int findWord(int start, char[] arr){
        
        if(start >= arr.length){
            return -1;
        }
        int wordEnd = start;
        while(wordEnd < arr.length && arr[wordEnd] != ' ')
        {
            wordEnd++;
           // System.out.println("*" + wordEnd);
        }
        
        return wordEnd;
    }
    
    public static void reverseString(int start,int end,char[] arr){
        if(arr==null){
            return;
        }
        while(start<=end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;                                               
            end--;
        }
    }
    
}
