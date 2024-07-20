package LinkedList.Assignments;


public class ReverseKList {
    public static ListNode reverseKGroup(ListNode head, int K) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevTail = dummy;
        ListNode currHead = head;

        while (currHead != null) {
            ListNode currTail = currHead;
            int i = 0;
            // Check if there are at least K nodes remaining
            for (i = 0; i < K - 1 && currTail != null; i++) {
                currTail = currTail.next;
            }

            // If there are less than K nodes, no need to reverse
            if (currTail == null) {
                break;
            }

            ListNode nextHead = currTail.next;
            currTail.next = null;  // Temporarily break the link

            // Reverse the K nodes
            ListNode newHead = reverseKNodes(currHead);

            // Connect the reversed part with the previous and next parts
            prevTail.next = newHead;
            currHead.next = nextHead;

            // Move prevTail and currHead to the next segment
            prevTail = currHead;
            currHead = nextHead;
        }

        return dummy.next;

    }

    public static ListNode reverseKNodes(ListNode head) {
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

    public static void main(String[] args) {
       ListNode l1 = new ListNode(1);
       ListNode n1 = new ListNode(3);
       ListNode n2 = new ListNode(5);
       ListNode n3 = new ListNode(7);
       ListNode n4 = new ListNode(9);
       ListNode n5 = new ListNode(8);
       ListNode n6 = new ListNode(6);
       ListNode n7 = new ListNode(4);
       ListNode n8 = new ListNode(2);
       ListNode n9 = new ListNode(0);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        ListNode.traverse(l1);
        ListNode ans = reverseKGroup(l1, 4);
        ListNode.traverse(ans);
    }
}
