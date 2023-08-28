class Link 
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
	
	public static void middleElement(Node start)
	{
		if(start == null)
		{
			return;
		}
		Node traverse = start;
		int length=0;
		
		while(traverse !=null)
		{
			length++;
			traverse =traverse.next;
		}
		
		traverse = start;
		int position=0;
		int middle=length/2;
		
		while(position != middle)
		{
			position++;
			traverse = traverse.next;
		}
		System.out.println(traverse.data);
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
		
		Link.insert(1);
		Link.insert(2);
		Link.insert(4);
		Link.insert(5);
		Link.insert(3);
		Link.insert(6);
		Link.insert(10);
		Link.insert(111);
		Link.display();
		System.out.println("middle");
		
		middleElement(first);
        	
        	
    	}
}
   
  class Node 
    {
        int data;
        Node next;
    }
