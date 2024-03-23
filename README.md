## Singly Linked List Assignment :

#### Visual representation of SLL :
[<img src="https://github.com/MoneemSuibgui/Java/assets/125930635/738f4d2a-49df-4c70-ab6f-fc7a33076535" width="500"  />](./link/to/sql/file)
##### Objectives:
```
Practice creating classes and objects
Learn and implement a singly linked list in Java
```
##### Tasks:
```
--> Create a Node class
--> Fill in the constructor method that sets the value to a given number and next to null of your Node objects
--> Create a SinglyLinkedList class like the above.
--> Create a constructor method that sets the head to null of your SinglyLinkedList objects
--> Create a remove() method that will remove a node from the end of your list
--> Create printValues() method that will print all the values of each node in the list in order
--> Create a ListTester class like the above
```
###### Optional Challenges:
```
--> Implement a find(int) method that will return the first node with the value in the parameter
--> Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter.
    For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
```


## Doubly Linked List Assignment :
#### Visual representation of DLL :
[<img src="https://github.com/MoneemSuibgui/Java/assets/125930635/11786757-98e2-4d13-ab7f-4ca47c1fa016" width="500"  />](./link/to/sql/file)
##### Objectives:
```
Construct a doubly linked list using OOP
```
##### Tasks:
```
In Dll assignment, we will implement common methods for Doubly Linked Lists

--> void printValuesBackward(): This method prints the values of the nodes from the tail to the head.
--> Node pop(): This method removes the last node of our DLL and returns it.
--> boolean contains(Integer value): This method returns a boolean whether the value in the argument is in the list or not.
    Return true if the value exists, else, return false.
-> int size(): Returns the number of nodes in the list.
```
###### Optional Challenges:
```
--> void removeAt(int index): This method removes a node at an index. For example,
    let's say that we have 3 nodes in our list. If we call removeAt(1), the middle node is removed. (head is index 0)
--> boolean isPalindrome(): This method returns a boolean whether the list is a palindrome or not.
     Return true if it is a palindrome, else, return false.
```


## Tries Assignment :
### Introduction to Tries : 
```
Tries are tree-like data structures that are efficient in reTrieving information.
Usually, Tries are used to store sequences of characters or words.
A perfect example of a trie data structure is google's auto complete feature in their search bar.
 Every time you type a letter, google searches possible suggestions for what you are looking for
```
#### Visual representation of Tries :
[<img src="https://github.com/MoneemSuibgui/Web_Fundamentals/assets/125930635/08f7ccea-7822-415d-b35d-b3c75090c30d" width="500"  />](./link/to/sql/file)



##### Objectives:
```
Construct a Trie using OOP
```
##### Tasks:
```
In this assignment, we implemented the following methods:

--> boolean isPrefixValid(String prefix):
    Returns a boolean whether the prefix is in the trie or not.
--> boolean isWordValid(String word):
    Returns a boolean whether the word is in the trie or not.
--> void printAllKeys(): This method prints all keys in the root in our trie.
```
