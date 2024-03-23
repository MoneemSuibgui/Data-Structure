package tries.moneem.java;


public class TestTrie {
	public static void main(String[] args) {

		Trie trie = new Trie();
		
		trie.insertWord("car");
		trie.insertWord("card");
		trie.insertWord("care");
		trie.insertWord("characters");
		trie.insertWord("trie");
		trie.insertWord("try");
		
		
		trie.printAllKeys(trie);
		
		System.out.println(trie.isWordValid("trie"));
		
		System.out.println(trie.isPrefixValid("tris"));
	
		
	}	


}
