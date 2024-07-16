package LinkedList;

public class ReverseKLists {
    public static Node<Integer> reverseKLists(Node<Integer> head, int K){
        Node<Integer> dummy = new Node<>(-1);

        Node<Integer> prevTail = dummy;
        Node<Integer> currHead = head;

        while (currHead != null){
            Node<Integer> currTail = currHead;
            for (int i = 0; i < K-1; i++) {
                if(currTail == null) break;
                currTail = currTail.next;
            }
            if(currTail == null) break;
            Node<Integer> nextHead = currTail.next;

            Node<Integer> newHead = reverseKTimes(currHead, K);

            prevTail.next = currTail;
            currHead.next = nextHead;

            prevTail = currHead;
            currHead = nextHead;
        }
        prevTail.next = currHead;
        return dummy.next;
    }

    public static Node<Integer> reverseKTimes(Node<Integer> head, int K){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> prev = head;
        Node<Integer> curr = head.next;
        for (int i = 0; i < K - 1; i++) {
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

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
        n4.next = n5;

        LinkedListNode.traverse(l1);

        Node<Integer> ans = reverseKLists(l1, 3);

        LinkedListNode.traverse(ans);
    }
}
