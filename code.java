class Linklist
{
	static Node previous = null;
    	static Node current = null;
    	static Node first = null;

    	public static void insert(int data) 
    	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;

        	if (first == null) {
            		
            		first = temp;
            		return;
        	} else 
        	{
            		current = first;
            		
            		while (current != null && current.data < temp.data) 
            	
            		{
		        	previous = current;
		        	current = current.next;
            		}
       		 }
       		 //first inserting
        	if (current == null && previous == null && first != null) 
        	{
            
		    	temp.next = first;
		    	
		    	first = temp;
		    	return;
        	}
        	
        	//last inserting
        	
        	if(previous != null && current == null)
        	{
			previous.next = temp;
			
			temp = current;
			return ;
			
        	
        	}
        	//first inserting
        	if(previous == null && current != null)
        	{
        		temp.next = current;
        		
        		current = temp;
        		return;
        	}
        	// middle inserting
        	
        	if(previous != null && current != null)
        	{
        		previous.next = temp;
        		temp.next = current;
        		return;
        	
        	}
        	
        	
        	
		
    }
	public static void deleteList(int data){
		previous=null;
		current=first;
		 
		while(current != null && current.data != data)
		{
    		    
    			previous = current;
    			current = current.next;
    	}
		if(previous == null && current == null)
		{
			System.out.print("No Nodes");
			return;
		}
		if(previous != null && current == null)
		{
			System.out.print("not found");
		}
		//in middle remove
		if(previous == null && current != null)
		{
			first = current.next;
			current.next=null;
			current = null;
		}
		
		if(previous != null && current != null)
		{
			previous.next = current.next;
			current.next = null ;
			current = null;
		}
	}
	
	
	
	
    	 public static void display() 
    	 {
        	Node tempe = first;

        	while (tempe != null) 
        	{
		    System.out.println(tempe.data + " ");
		    tempe = tempe.next;
        	}
     	}
 
    	public static void main(String[] args) 
    	{
		
		Linklist.insert(1);
		Linklist.insert(2);
		Linklist.insert(4);
		Linklist.insert(5);
		Linklist.insert(3);
		Linklist.insert(6);

		Linklist.deleteList(5);
		Linklist.deleteList(3);
		
		
        	Linklist.display();
        	
    	}
}
   
  class Node 
    {
        int data;
        Node next;
    }
