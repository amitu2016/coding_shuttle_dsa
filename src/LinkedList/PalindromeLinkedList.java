package LinkedList;

import java.util.Objects;


public class PalindromeLinkedList {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(2);
        Node<Integer> n4 = new Node<>(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(isLinkedListPalindrome(head));
    }

    public static Boolean isLinkedListPalindrome(Node<Integer> head){
        if (head == null || head.next == null){
            return true;
        }

        Node<Integer> middleNode = FindMiddleNode.findMiddleNode(head);

        Node<Integer> reversedFromMiddle = ReverseLinkedList.reverseLinkedList(middleNode);

        Node<Integer> temp = head;

        while (reversedFromMiddle != null){
            if(!Objects.equals(temp.data, reversedFromMiddle.data)){
                return false;
            }else{
                temp= temp.next;
                reversedFromMiddle = reversedFromMiddle.next;
            }
        }
        return true;
    }
}
