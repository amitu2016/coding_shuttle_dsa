package Stack;

public class StackUsingArray {

    int top;
    int arr[];

    StackUsingArray() {
        top = -1;
        arr = new int[1000];
    }

    void push(int a) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }

        arr[++top] = a;
    }

    int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public static void main(String[] args) {

    }
}
