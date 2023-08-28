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
	
	/*public static Node reverse(Node first)
	{
		if(first == null || first.next ==null)
		{
			return first;
		}
		 Node previous = first;
		 Node current= previous.next;
		 first.next=null;
		while(current != null)
		{
			Node temp=current;
			current=current.next;
			temp.next=previous;
			previous = temp;
		}
		return previous;
		
	}*/
	
	public static Node reverse(Node first)
	{
		Node previous = null;
		Node current = first;
		
		while(current !=null)
		{
			Node temp = current.next;
			current.next=previous;
			previous = current;
			current = temp;
		}
		return previous;
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
		
		System.out.println("reverse");
		first=Link.reverse(first);
		Link.display();
        	
    	}
}
   
  class Node 
    {
        int data;
        Node next;
    }
