class main{
  public static void main(String[] args){
       String x="My fav god is loard shiva . He is the symbol of truth . He is always there with me in my every situation.";
       String bag="";
       for(int i=0;i<x.length();i++){
           if(x.charAt(i)=='.'){
              bag=bag+x.length();
            }
            System.out.println(bag);
          }
       }
     }
