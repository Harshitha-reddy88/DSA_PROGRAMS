public class Main{
   public static void main(String[] args){
       int n=7;
        for(int i=1;i<=n;i++){
        String bag="";
          for(int j=1;j<=n;j++){
             if(i==j ||i+j==n+1){
                bag=bag+"*";
              }
              else{
                bag=bag+" ";
              }
            }
            System.out.println(bag);
          }
        }
      }
          
