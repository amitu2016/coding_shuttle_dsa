package LinkedList.Assignments;


public class ReorderList {

    public static void reorderList(ListNode head) {

        ListNode middleNode = findMiddleNode(head);

        ListNode l1 = head;

        ListNode l2 = middleNode.next;

        middleNode.next = null;

        l2 = reverseNodes(l2);

        while (l1 != null && l2 != null){
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;

            l1.next = l2;

            if(l1Next == null) break;

            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }

    }

    public static ListNode reverseNodes(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode findMiddleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {


        ListNode l1 = new ListNode(0);
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(-9);
        ListNode n4 = new ListNode(7);
        ListNode n5 = new ListNode(3);
        ListNode n6 = new ListNode(-1);
        ListNode n7 = new ListNode(-3);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        ListNode.traverse(l1);

        reorderList(l1);

        ListNode.traverse(l1);

    }
}
