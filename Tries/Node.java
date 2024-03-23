package tries.moneem.java;

import java.util.HashMap;

public class Node {
	
	// Create 2 memeber variable for Node class
	HashMap<Character, Node> children;
	boolean isCompleteWord;

	// create constructor ,by default node has empty Hashmap of Key:character, and values of Node object & isComplete by deafult false
	public Node() {
		this.children = new HashMap<Character, Node>();
		this.isCompleteWord = false;
	}
}
