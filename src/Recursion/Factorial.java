package Recursion;

public class Factorial {

    public static int findFactorial(int n, int r){
        if (n == r || r== 0){
            return 1;
        }

        return findFactorial(n -1, r-1) + findFactorial(n -1, r);
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(5, 2));
    }
}
