public class ListTest {
    
    public static void main(String[] args) {
        
        // instantiate SinglyLinkedList Object
        SinglyLinkedList sll=new SinglyLinkedList();
        
        // Execute all methods to object and display results in the console
        sll.add(8);
        sll.add(17);
        sll.add(15);
        sll.add(9);
        

        sll.remove();
        sll.printValues();
        sll.find(8);
    }
}
