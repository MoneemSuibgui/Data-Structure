package dll.moneem.java;

public class Node {

	// Node object has 3 variables : next,previous and the value of the node
	Node next ;
	Node previous;
	Integer value;
	
	// instantiate Node object in the node class
	public Node(Integer val) {
		this.next=null;
		this.previous=null;
		this.value=val;
	}
	
	
	
}
