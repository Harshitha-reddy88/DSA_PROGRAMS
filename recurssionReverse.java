public class Main {
    public static void main(String[] args)
    {
        String str = "harshi";
        int start = 0;
        int end = str.length() - 1;
        int i = 0;
        String str1 = "";
        System.out.println(reverse(str,start,end,i,str1));
    }

    public static String reverse(String str, int start, int end, int i, String str1) {
        if (end<start)
         {
            return str1;
         }
       
        str1 = str1 + str.charAt(end);
       
        return reverse(str, start, end-1,i, str1);
    }
} 
