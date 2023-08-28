public class Main{
    public static void main(String[] args){
         int[] x={1,1,1,1,1,5,5,5,};
         int[] y={2,2,2,2,2,5,5,5};
         String bag="";
         for(int i=0;i<x.length;i++){
            bag=bag+x[i]+" ";
       }
       for(int j=0;j<y.length;j++){
            bag=bag+y[j]+" ";
          }
          System.out.println(bag);     
     }
   }
     
