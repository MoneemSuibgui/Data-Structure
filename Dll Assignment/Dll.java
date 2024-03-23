package dll.moneem.java;

public class Dll {
	// doubly linked list Dll has 3 mamber variables
	public Node head;
	public Node tail;
	public int size;

	public Dll() {
		this.head = null;
		this.tail = null;
		this.size=0;
	}
	
	// create isEmpty method to reuse this method
	public boolean isEmpty() {
		return this.head == null;
	}

	// void push(): This method add a node at the last of the list
	public void push(int val) {
		Node newNode=new Node(val);
		// if the list is empty
		if(this.head == null) {
			this.head=newNode;
			this.tail=newNode;
			this.size++;
			return ;
		}else {
			// first find the lastNode in the list
	        // then, set the lastNode's next to be the newNode;
	        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
	        // finally, set the list's tail to be the node that we have added
			Node lastNode=this.tail;
			lastNode.next=newNode;
			newNode.previous=lastNode;
			this.tail=newNode;
			this.size++;
		}
	}
	

	// void addFirst(val): This method add a node at the first of the list
	public void addFirst(int val) {
		Node newNode=new Node(val);
		
		if(isEmpty()) {
			this.head=newNode;
			this.tail=newNode;
			this.size++;
		}else {
			Node runner=this.head;
			if(runner != null) {
				// intialise the head to be the added node
				this.head=newNode;
				// increment the runner to be equel runner.next
				newNode.next=runner;
				this.size++;
			}
		}
	}
	
	
	//Todo:addAt(int index): This method add a node at an index. 
	
	
	

	// void printValuesForward() : This method prints the values of the nodes from the head to the tail
	public void printValuesForward() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		Node pointer=this.head;
		int index=0;
		while(pointer !=null) {
			System.out.println("Node of index  "+index+" is :  "+pointer.value);
			index++;
			pointer=pointer.next;
			
		}
		System.out.println("##########################");	
	}
	
	
	// void printValuesBackward(): This method prints the values of the nodes from  the tail to the head
	public void printValuesBackward() {
		if(isEmpty()) {
			System.out.println("List is empty !!!");
		}
		Node pointer=this.tail;
		int index=0;
		while(pointer != this.head) {
			System.out.println("Node of index  "+index+" is :  "+pointer.value);
			pointer=pointer.previous;
			index++;
		}
		System.out.println("Node of index  "+index+" is :  "+pointer.value);
		System.out.println("##########################");
	}
	
	

	// boolean isPalindrome(): This method returns a boolean whether the list is a
	// palindrome or not. Return true if it is a palindrome, else, return false.
	public boolean isPalindrome() {
		if(size()>1) {
			// this mathematical equation for calculate the half by create 2 strings 
			// and check if there is equal by reverse the second or no then check our list is Palindrome() or no 
			int half = (int)size()/2;
			String left = "";
			String right = "";
			Node runner = head;
			for(int i=0; i<half; i++) {
				left += runner.value;
				runner = runner.next;
			}
			
			runner = this.tail;
			for(int i=0; i<half; i++) {
				String runnerString = runner.value.toString();
				for(int j=runnerString.length()-1; j>=0; j--) {
					right+=runnerString.charAt(j);
				}
				runner = runner.previous;
			}
			
			if(left.equals(right)) {
				return true;
			}
		}
		return false;
	}
	
	
		// int size(): Returns the number of nodes in the list
	//	public int size() {
	//		int count = 0;
	//		if (head == null) {
	//			return count;
	//		} else {
	//			Node runner = head;
	//			while (runner.next != null) {
	//				count++;
	//				runner = runner.next;
	//			}
	//		}
	//		return count + 1;
	//	}
	
	// other way to create int size() method that returns the number of nodes in the list
	public int size() {
		return this.size;
	}
	

	// This method returns a boolean whether the value in the argument is in the list or not.
	// Return true if the value exists, else, return false.
	public boolean contains(int val) {
		if(isEmpty()) {
			// the list is empty
			return false;
		}
		Node pointer=this.head;
		while(pointer != null) {
			if(pointer.value == val) {
				return true;
			}
			pointer = pointer.next;
		}
		return false;
	}

	// Node pop(): This method removes the last node of our DLL and returns it.
	public void pop() {
    	
    	if(isEmpty()) {
    		System.out.println("List is empty !!!!");
    	}
    	if(this.head != null && this.head == this.tail) {
    		this.head=null;
    		this.size--;
    	}else {
    		Node runner=this.head;
    		// iterate through the list
    		while(runner.next != null) {
        		runner=runner.next;
    	    }
    		// we get the end of the list ,the last set the the tail to the lastnode .previous and the next to null
        	this.tail=runner.previous;
        	this.tail.next=null;
        	this.size--;
        	System.out.println("####################");
    	}
    		
        	
    	}

	// removeFirst(): This method removes the first node of our DLL
	public void removeFirst() {
		if(isEmpty()) {
			System.out.println("List is empty nothing to remove !!!");
		}
		if(this.head != null && this.head.next==null) {
			this.head=null;
		}else {
			Node runner=this.head;
			if(runner != null) {
				this.head=runner.next;
				this.size--;
				runner=null;
			}
		}
	}
	
	
	
	

	// removeAt(int index): This method removes a node at an index. For example,
	// let's say that we have 3 nodes in our list. If we call removeAt(1), the
	// middle node is removed. (head is index 0)
	public void  removeAt(int index) {
		if(isEmpty()) {
			System.out.println("List is empty nothing to remove");
		}
		// check at index 0 the head will be head.next
		if(index == 0) {
			this.head=this.head.next;
			this.size--;
		}
		int counter=1;
		Node runner=this.head;
		// iterate through our list
		while(runner !=null) {
			// check if the counter eqaul the index then will set the runner 
			if(counter == index) {
				runner.next=runner.next.next;
				runner.previous=runner.next;
				this.size--;
			}
			counter++;
			runner=runner.next;
		}
	}
	
	
	
	
}