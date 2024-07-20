package LinkedList;

public class RemoveDuplicate {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null) return head;

        ListNode currNode = head;

        while(currNode.next != null){
            ListNode nextNode = currNode.next;
            if (currNode.val == nextNode.val){
                currNode.next = nextNode.next;
            }else{
                currNode = currNode.next;
            }
        }

        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-1);
        ListNode n1 = new ListNode(-1);
        ListNode n2 = new ListNode(-1);
        ListNode n3 = new ListNode(-1);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(2);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(3);
        ListNode n8 = new ListNode(3);
        ListNode n9 = new ListNode(3);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;

        RemoveDuplicate obj = new RemoveDuplicate();

        ListNode ans = obj.deleteDuplicates(l1);

        ListNode.traverse(ans);
    }
}
