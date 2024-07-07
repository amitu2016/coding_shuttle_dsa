package LinkedList;

public class FindMiddleNode {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(6);
        Node<Integer> n4 = new Node<>(8);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        int ans = findMiddleNode(head);
        System.out.println(ans);
    }

    public static int findMiddleNode(Node<Integer> head){

        Node<Integer> fastPtr = head, slowPtr = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        assert slowPtr != null;
        return slowPtr.data;
    }
}
