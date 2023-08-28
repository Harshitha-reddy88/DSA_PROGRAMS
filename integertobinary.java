public class main{
   public static void main(String[] args){
       
   }
          int num=42;
          String str="";
          String bag="";
          while(num>0){
            bag=bag+num%2;
            num=num/2;
          }
          for (int i = 0; i <bag.length(); i++) {
             str=bag.charAt(i)+str;
           }
           System.out.println(str);
        }
      } 
   
