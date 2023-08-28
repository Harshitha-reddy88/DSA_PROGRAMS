public class Main{
   public static void main(String[] args){
       String x="harshi";
       String y="1234567890";
       String bag="";
       for(int i=0;i<x.length();i++){
          for(int j=0;j<y.length();j++){
            if(x.charAt(i)==y.charAt(j)){
            bag="true";
              }
              else{
                 bag+="false";
               }
             }
           }
           System.out.println(bag);
         }
       }
       
       
       
