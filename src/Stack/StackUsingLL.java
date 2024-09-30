package Stack;

public class StackUsingLL {
    Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int temp = head.data;
            head = head.next;
            return  temp;
        }
    }


    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


        System.out.println();
        stack.pop();





    }

}


class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

