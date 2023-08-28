public class Linkedlist
{
    static Node previous = null;
    static Node current = null;
    static Node first = null;
     public static void insert( int data )
    {
   	 Node temp = new Node();
   	 temp.data = data;
   	 temp.next = null;
   	 
   	 if( first == null )
   	 {
   		 first = temp;
                 return;
   	 }
   	 else{
   		 current = first;
   		 previous=null;
   		 while ( current != null && current.data < temp.data )
   		 {
   		      previous = current;
   		      current = current.next;
   		  }
   	 }
   	  if( current == null && previous != null )
   	  {
   		 previous.next = temp;
   		 temp = current;
   		 return;
   	 }
   	 	 if( current == null && previous == null && first != null )
   	 {
   		 temp.next = first;
   		 first = temp;
   		 return;
   	 }
   	  if( current != null && previous == null )
   	 {
   		 temp.next = current;
   		 first =temp;
   		 return;
   	 }
   	  if( previous != null && current != null )
   	 {
   	      previous.next = temp;
   	      temp.next = current;
   	      return;
   	 }
   }
   	 
   	 
   	 
   	 public static void delete()
   	 {
   	     if(previous ==null && current !=null)
   	     {
   	     	first = current.next;
             	current.next = null;
             	current = null;
   	     }
   	 }
     public static void display()
     {
   	 Node temp = first;
   	 while ( temp != null )
   	 {
   		 System.out.println( temp.data+ " " );
   		 temp = temp.next;
   	 }
   	 
     }
    public static void main(String[] args)
    {
    	Linkedlist.insert(1);
    	Linkedlist.insert(2);
    	Linkedlist.insert(4);
    	Linkedlist.insert(5);
    	Linkedlist.insert(3);
    	Linkedlist.insert(6);
    	Linkedlist.insert(0);
    	//Linkedlist.deleteMiddle(3);
    	Linkedlist.deleteMiddle(1);
    	Linkedlist.display();
    }
    }
    class Node{
    	int data;
    	Node next;
    }
