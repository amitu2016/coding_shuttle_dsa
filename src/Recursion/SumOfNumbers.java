package Recursion;

public class SumOfNumbers {

    public static int sumOfNumbers(int n){
        if (n == 1) {
            return 1;
        }

        return  sumOfNumbers(n -1) + n;

    }


    public static void main(String[] args) {
        System.out.println(sumOfNumbers(10));
    }


}
