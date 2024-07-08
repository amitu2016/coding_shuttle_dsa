package LinkedList;

public class ReverseLinkedListRecursive {

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

        Node<Integer> ans = reversLLRecursive(head);

        LinkedListNode.traverse(ans);
    }

    public static Node<Integer> reversLLRecursive(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }

        Node<Integer> newHeadOfSubProblem = reversLLRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return  newHeadOfSubProblem;
    }

}
