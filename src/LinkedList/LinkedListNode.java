package LinkedList;

public class LinkedListNode {

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

       // traverse(head);

        //Node<Integer> ans = insertAtPos(2,9,head);

        Node<Integer> ans = deleteNodeAtPos(2, head);

        traverse(ans);

    }

   public static void traverse(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
       System.out.println();
   }

   public static Node<Integer> insertAtPos(int pos, int data, Node<Integer> head){

        Node<Integer> newNode = new Node<>(data);

        Node<Integer> temp = head;

        if (pos == 0){
            newNode.next = head;
            return newNode;
        }

       for (int i = 0; i < pos - 1; i++) {
           temp = temp.next;
       }

       newNode.next = temp.next;
       temp.next = newNode;

       return head;
   }

   public static Node<Integer> deleteNodeAtPos(int pos, Node<Integer> head){
        if (pos == 0){
            return head.next;
        }

        Node<Integer> temp = head;

       for (int i = 0; i < pos - 1; i++) {
           temp = temp.next;
       }

       temp.next = temp.next.next;

       return  head;
   }
}
