package LinkedList;

public class ReorderLL {

    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(1);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(6);
        Node<Integer> n4 = new Node<>(1);
        Node<Integer> n5 = new Node<>(7);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
       // n4.next = n5;

        LinkedListNode.traverse(l1);

        Node<Integer> ans = reorderLL(l1);

        LinkedListNode.traverse(ans);

    }


    public static Node<Integer> reorderLL(Node<Integer> head){
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node<Integer> middleNode = FindMiddleNode.findMiddleNode(head);

        // Split the list into two halves and reverse the second half
        Node<Integer> l1 = head;
        Node<Integer> l2 = middleNode.next;
        middleNode.next = null;  // Split the list into two halves
        l2 = ReverseLinkedList.reverseLinkedList(l2);

        // Merge the two halves
        while (l1 != null && l2 != null) {
            Node<Integer> l1Next = l1.next;
            Node<Integer> l2Next = l2.next;

            l1.next = l2;

            // Check to avoid cycle or unnecessary link at the end
            if (l1Next == null) {
                break;
            }

            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }

        return head;
    }

}
