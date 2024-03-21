package dll.moneem.java;

public class DllTest {

	public static void main(String[] args) {
		// instantiate doubly linked list dll object
		Dll dll = new Dll();

		// add some nodes to the list
    	dll.push(1);
    	dll.push(32);
    	dll.push(41);
    	dll.push(23);
    	dll.push(1);
    	
    	dll.printValuesForward();
    	dll.printValuesBackward();
    	
    	System.out.println("List is palindrome : "+dll.isPalindrome());
    	
    	System.out.println(dll.contains(23));
    	System.out.println(dll.contains(15));
    	System.out.println("DLL Size: " + dll.size());
        dll.pop();
       
        dll.printValuesForward();
        System.out.println("DLL Size: " + dll.size());
        dll.removeFirst();
        
        dll.printValuesForward();
        System.out.println("DLL Size: " + dll.size());
        
        dll.addFirst(88);
        dll.addFirst(12);
        dll.printValuesForward();
        System.out.println("DLL Size: " + dll.size());
        
        dll.removeAt(0);
        dll.printValuesForward();
        System.out.println("DLL Size: " + dll.size());
        System.out.println("List is palindrome : "+dll.isPalindrome());
    }
	

}
