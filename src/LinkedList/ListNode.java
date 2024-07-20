package LinkedList;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
		val = 0;
		next = null;
	}
	ListNode(int val) {
		this.val = val;
		next = null;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static void traverse(ListNode head){
		ListNode temp = head;
		while (temp != null){
			System.out.print(temp.val+" -> ");
			temp = temp.next;
		}
		System.out.println();
	}
}
