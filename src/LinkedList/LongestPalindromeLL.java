package LinkedList;

import java.util.Objects;

public class LongestPalindromeLL {

    public static int lengthOfLongestPalindrome(Node<Integer> head){
        if(head == null) return 0;
        if (head.next == null) return 1;

        Node<Integer> curr = head;
        Node<Integer> prev = null;

        int ans = 0;

        while (curr != null){
            Node<Integer> next = curr.next;
            curr.next = prev;

            int oddLengthMatch = longestMatchingLL(prev, next);
            int oddPalindromeLength = 2 * oddLengthMatch + 1;

            int evenLengthMatch = longestMatchingLL(curr, next);
            int evenPalindromeLength = 2 * evenLengthMatch;

            int maximum = Math.max(oddPalindromeLength, evenPalindromeLength);

            ans = Math.max(ans, maximum);

            prev = curr;
            curr = next;
        }

        return ans;
    }

    public static int longestMatchingLL(Node<Integer> a, Node<Integer> b){
        int count = 0;
        while (a != null && b != null){
            if (Objects.equals(a.data, b.data)){
                count++;
                a= a.next;
                b=b.next;
            }else break;
        }
        return count;
    }

    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(1);
        Node<Integer> n4 = new Node<>(1);
        Node<Integer> n5 = new Node<>(7);

        l1.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(lengthOfLongestPalindrome(l1));
    }
}
