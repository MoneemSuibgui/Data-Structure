public class SinglyLinkedList {
    // Sll have head member variable of type of Node object
    public Node head;


    // Create a constructor method that sets the head to null of our SinglyLinkedList objects
    public SinglyLinkedList(){
        this.head=null;
    }

    // create isEmpty method that return boolean value to check if our list is empty or no
    public boolean isEmpty(){
        if(head==null){
            return true;
        }return false;
    }


    // add node to sll
    public void add(int value){
        Node newNode=new Node(value);
        // check if our singly linked list is empty
        if(isEmpty()){
            head=newNode;
            //System.out.println(String.format("Node Value: %s", newNode.value));
        }else{
            
            newNode.next=head;
            head=newNode;            
            //System.out.println(String.format("Node Value: %s", newNode.value));
            }
            
        }


    // Create a remove() method that will remove a node from the end of your list
    public Integer remove() {
        Node runner = head;
        int valToReturn;

        // if we have 0 nodes return null
        if(isEmpty())
            return null;

        // if we have just one node, remove head
        if(head.next == null) {
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }

        // otherwise, loop til we are right before the last node
        while(runner.next.next != null) {
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
        
    }

    //Create printValues() method that will print all the values of each node in the list in order
    public void printValues(){
        
        if(isEmpty()){
            System.out.println("sll is empty  !!!");
            return;
        }
        while (head.next!= null) {
                System.out.println(String.format("Node Value : %s   %nNext Value : %s ", head.value,head.next.value));
                head=head.next;
            }
            System.out.println("we reach the end of our singly linked list");
        }



    // Create find method that display the searched value given by user 
    public void find(int val){
        if(isEmpty()){
            System.out.println("List is empty !!");
        }
        // iterate throught our list if sll is not empty
        while(head != null){
            if(head.value == val){
                System.out.println("the node for value : "+val +" is exist in the list");
            }
            else{
                System.out.println("the value "+val+" doesn't exist in the list");
            }
            head=head.next;
            
        }
    }
    

}