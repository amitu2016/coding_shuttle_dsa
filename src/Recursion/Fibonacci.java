package Recursion;

public class Fibonacci {

    public static int fibonacciN(int n){

        if (n <= 1){
            return n;
        }

        return  fibonacciN(n-1) + fibonacciN(n -2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacciN(6));
    }

}
