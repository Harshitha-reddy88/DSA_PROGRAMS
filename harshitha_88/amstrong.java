public class Main{
  public static void main(String[] args){
      int num=1234;
      String x="";
      int z=0;
      String y=x+num;
      int count=0;
      for(int i=0;i<y.length();i++){
         count++;
       }
       z=z+count;
       double a=1;
       for(int i=0;i<y.length();i++){
         a=(Math.pow(i,z));
       }
       System.out.println(a);
     }
   }
