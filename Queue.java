package queueassignment;

public class Queue {
	
	private Node Front; 
	private Node Rear; 
	 
	 public Queue()  {   
		 Front = null;   
		 Rear = null; 
		 } 
	 
	 public Node getFront() {  
		 return Front; 
		 } 

	 public Node getRear() { 
		 return Rear; } 
	 
	 public void setFront(Node n) {  
		 Front = n; } 
	  
	 public void setRear(Node n) { 
		 Rear = n; } 
	 
	 public void Enqueue(String reg_num,String lisc_plate, String vehicle_type)  {  
		 Node temp = new Node(reg_num,lisc_plate, vehicle_type);  
		 if (temp != null)  {    
			 if(Front ==null)    {   
				 Front=temp;     
				 Rear=temp;    }  
			 else    {   
				 Rear.setNextNode(temp);    
				 temp.setPrevNode(Rear);    
				 Rear = temp;    }  
			 } else
			 {  
				 System.out.println("The list is full. Cannot add another node.");
			 } 
	 }
		 
		  public fitness Dequeue()  {  
			  fitness dataToReturn = null;  
			  if(Front != null)   { 
				  if(Front == Rear)    { 
					  Rear = null; } 
				  Node temp = Front;   
				  dataToReturn = Front.getData(); 
				  Front = Front.getNextNode();   
				  temp = null;          
				  }  
			  return dataToReturn;  
			  }   
		  
		  public fitness QueueFront()  {   
			  if(Front == null)   {    
				  System.out.println("The Queue is empty, cannot return value(s).");  
				  return null;  
				  } else   {    
					  return Front.getData();   
					  }  
		  }
		  
		  public fitness QueueRear()  {   
			  if(Front == null)   {    
				  System.out.println("The Queue is empty, cannot return value(s).");  
				  return null;  
				  } else   {    
			  return Rear.getData();
				  }
			}  
		  
		  public int CountNodes()  {  
			
			  int count = 0; 
			  Queue tempQueue = new Queue(); 
		  
          while(Front != null) {
        	
        	  tempQueue.Enqueue(Dequeue( ));         
        	  count++;          
        	  } 

          while(tempQueue.getFront()!= null)       
          {              
        	  Enqueue(tempQueue.Dequeue());      
        	  }         
          return count; }*/

	 
	 } 
	 
	 
	 

