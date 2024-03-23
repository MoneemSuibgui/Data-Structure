package tries.moneem.java;

import java.util.Set;

public class Trie {

	public Node root;

	// Trie constructor : initialize the root to be new Node object
	public Trie() {
		this.root = new Node();
	}

	// isertWord method : insert characters of given word in ou trie
	public void insertWord(String word) {
		// gets the current node
		Node currentNode = this.root;

		// iterates over every character in the word
		for (int i = 0; i < word.length(); i++) {
			Character currentLetter = word.charAt(i);
			// ask if the current letter is in the map of the current node
			Node child = currentNode.children.get(currentLetter);

			if (child == null) {
				// create new Node and insert the current letter into the current node
				child = new Node();
				currentNode.children.put(currentLetter, child);
			}
			currentNode = child;
		}
		// after insert all character of the word ,set isComplete to true
		currentNode.isCompleteWord = true;
	}

	// boolean isWordValid(String word): Returns a boolean whether the word is in
	// the trie or not.
	public boolean isWordValid(String word) {
		Node currentNode = this.root;
		for (int i = 0; i < word.length(); i++) {
			Character currentChar = word.charAt(i);
			// check if the first character in the map of the current node dosen't exist
			// retuen false
			if (!currentNode.children.containsKey(currentChar)) {
//				System.out.println(currentChar +" This character is not exist ");
				return false;
			}
//			System.out.println(currentChar);
			// increment the currentNode by the currentNode that his map has that current
			// chararacter of the word
			currentNode = currentNode.children.get(currentChar);
		}
		// after itertae the word check if isCompleteWord of the currentNode is true or
		// not
		if (currentNode.isCompleteWord) {
			return true;
		}
		return false;

	}

	// boolean isPrefixValid(String prefix): Returns a boolean whether the prefix is
	// in the trie or not.
	public boolean isPrefixValid(String prefix) {
		Node currentNode = this.root;
		for (int i = 0; i < prefix.length(); i++) {

			// get the currentcharacter of the word
			Character currentChar = prefix.charAt(i);

			if (!currentNode.children.containsKey(currentChar)) {
				System.out.println(currentChar + " doesn't exist in the tree");
				return false;
			}
			System.out.println(currentChar + "  exist in the tree");
			// increment the currentNode
			currentNode = currentNode.children.get(currentChar);
		}
		return true;
	}

	// void printAllKeys(): This method prints all keys in the root in our trie
	public void printAllKeys(Trie trie) {
		// get the keys by using the keySet method
		Set<Character> keys = trie.root.children.keySet();
		for (Character key : keys) {
			System.out.println(key);
		}
	}

}
