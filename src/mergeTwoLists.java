
public class mergeTwoLists {
	
	public static void main(String[] args) {
		mergeTwoLists twolists = new mergeTwoLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = twolists.mergeTwoLists(l1, l2);
        twolists.printList(mergedList);  // print the merged list
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();  // print a newline
    }

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode head = new ListNode();
		ListNode tail = head;
		while(l1 != null || l2!= null) {
			if(l2== null || (l1!= null && l1.val<l2.val)) {
				tail.next=l1;
				tail=l1;
				l1=l1.next;
			} else {
				tail.next = l2;
				tail=l2;
				l2=l2.next;
			}
			
		}
		return head.next;

		
	}



// here we are defining what a ListNode actually does
	// we declare it as static so we can use it 
public static class ListNode {
	//we define an int val
    int val;
    // declaration of an instance variable within ListNode class
    // the variable is of type ListNode and named next
    // reference next points to the next ListNode in the LinkedList
    // more accurate to say that next refers to the next List Node
    // ListNode next is a declaration of an instance variable within 
    // the ListNode class 
    // an instance variable is a variable that is bound to the instance of a class 
    // Within the ListNode class 
    // the next instance variable is defined inside the ListNode Class
    ListNode next;

    ListNode() {}

    ListNode(int val) { 
        this.val = val; 
    }

    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next; 
    }
}

}