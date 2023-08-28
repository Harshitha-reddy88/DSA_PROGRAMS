public class Main{
    public static void main(String[] args){
    int bag=0;
          int[][] arr={{1,2,3,4},{5,6,7,8},{3,5,6,6},{1,4,7,3}};
                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr.length;j++){
                        if(i==0 || j==0 || i==arr.length-1 || j==arr.length-1){
                            bag=bag+arr[i][j];
                          }
                        }
                     }
                     System.out.println(bag);
                  }
               }
