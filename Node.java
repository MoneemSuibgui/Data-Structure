public class Node {

    // Each node have tow memmber variables value type int and next of type node object
    public int value;
    public Node next;

    // Fill in the constructor method that sets the "value" to a given number and next to null of our Node objects
    public Node(int value){
        this.value=value;
        this.next=null;
    }
}