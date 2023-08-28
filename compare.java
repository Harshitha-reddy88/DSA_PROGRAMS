class main {
  public static void main(String[] args) {
    String x = "harshi";
    String bag = "israh";
    String bag1="";
    for (int i = 0; i <x.length(); i++) {
      bag1 =x.charAt(i) + bag1;
    }
    if(bag==bag1){
      System.out.println("both are same");
     }
     else{
       System.out.println("not same");
     }
  }
}
