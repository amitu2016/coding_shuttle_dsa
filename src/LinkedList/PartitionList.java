package LinkedList;


public class PartitionList {

    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(1);
        Node<Integer> n1 = new Node<>(5);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(2);
        Node<Integer> n5 = new Node<>(2);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        LinkedListNode.traverse(l1);

        Node<Integer> ans = partitionList(l1, 3);
        LinkedListNode.traverse(ans);
    }

    public static Node<Integer> partitionList(Node<Integer> head, int K){
        Node<Integer> leftHead = new Node<>(-1);
        Node<Integer> rightHead = new Node<>(-1);

        Node<Integer> leftTail = leftHead;
        Node<Integer> rightTail = rightHead;

        Node<Integer> curr = head;

        while (curr != null){
            if (curr.data < K){
                leftTail.next = curr;
                leftTail = curr;
            }else{
                rightTail.next = curr;
                rightTail = curr;
            }
            curr = curr.next;
        }

        rightTail.next = null;
        leftTail.next = rightHead.next;
        return leftHead.next;
    }
}
