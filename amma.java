public class Main{
  public static void main(String[] args){
     int n=8;
     for(int i=n-1;i>=0;i--){
        String hello="";
        for(int j=1;j<=i;j++){
           hello=hello+"*"+" ";
         }
         System.out.println(hello);
       }
     }
   }
        
