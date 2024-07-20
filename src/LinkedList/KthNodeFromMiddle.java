package LinkedList;

public class KthNodeFromMiddle {

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


        KthNodeFromMiddle obj = new KthNodeFromMiddle();

        int ans = obj.kthNode(l1, 3);

        System.out.println(ans);

    }

    public int kthNode(ListNode head, int B) {
        if (head == null) return -1;

        ListNode middleNode = findMiddleNode(head);

        // Calculate the number of nodes from the head to the middle node
        int lengthToMiddle = 0;
        ListNode temp = head;
        while (temp != middleNode) {
            temp = temp.next;
            lengthToMiddle++;
        }

        // Calculate the index of the Bth node from the middle towards the beginning
        int targetIndex = lengthToMiddle - B;

        if (targetIndex < 0) return -1;

        // Traverse from the head to the target index
        temp = head;
        for (int i = 0; i < targetIndex; i++) {
            temp = temp.next;
        }

        return temp.val;
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


    public static void traverse(ListNode head){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
