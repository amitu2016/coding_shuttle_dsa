package LinkedList;

public class AddLinkedList {

    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(1);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(5);
        Node<Integer> n3 = new Node<>(6);
        l1.next = n1;
        n1.next = n2;
        n2.next = n3;

        Node<Integer> l2 = new Node<>(2);
        Node<Integer> n4 = new Node<>(1);
        Node<Integer> n5 = new Node<>(7);
        l2.next = n4;
        n4.next = n5;

        LinkedListNode.traverse(l1);
        LinkedListNode.traverse(l2);

        Node<Integer> ans = addLL(l1, l2);

        LinkedListNode.traverse(ans);

    }

    public static Node<Integer> addLL(Node<Integer> l1, Node<Integer> l2){

        Node<Integer> r1 = ReverseLinkedList.reverseLinkedList(l1);
        Node<Integer> r2 = ReverseLinkedList.reverseLinkedList(l2);

        int carry = 0;
        Node<Integer> ans = null;
        Node<Integer> temp = null;

        while (r1 != null || r2 != null || carry != 0){
            int sum = carry;

            if (r1 != null){
                sum+= r1.data;
                r1= r1.next;
            }

            if (r2 != null){
                sum+= r2.data;
                r2 = r2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            Node<Integer> newNode = new Node<>(digit);

            if(ans == null){
                ans = temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        return ReverseLinkedList.reverseLinkedList(ans);
    }
}
