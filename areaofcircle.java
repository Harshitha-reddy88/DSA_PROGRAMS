//finding the area of the circle
 public class Main
	{
   		public static void main(String[] args){
     		int radius=7;
     		System.out.println(radiusOfTheCircle(radius));
   	}
   	
   	
  //area of circule is 22/7*radius*radius
   	public static int radiusOfTheCircle(int radius)
   	{
       		int x=(22*radius*radius)/7;
       		return x;
     	}
   }
