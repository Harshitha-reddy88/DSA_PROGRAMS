public class main{
   public static void main(String[] args){
          int x=42;
          String bag1="";
          String bag="";
          while(x>0){
            bag=bag+x%2;
            x=x/2;
          }
          for (int i = 0; i <bag.length(); i++) {
             bag1=bag.charAt(i) + bag1;
           }
           System.out.println(bag1);
        }
      } 
         
         
