package LinkedList;

import java.util.Objects;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(3);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);
        Node<Integer> n4 = new Node<>(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node<Integer> ans = removeDupliacteNode(head);
        LinkedListNode.traverse(ans);
    }

    public static Node<Integer> removeDupliacteNode(Node<Integer> head){

        Node<Integer> tempNode = head;

        while (tempNode.next != null){
            if(Objects.equals(tempNode.next.data, tempNode.data)){
                tempNode.next = tempNode.next.next;
            }else{
                tempNode = tempNode.next;
            }
        }
        return head;
    }
}
