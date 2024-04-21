package Recursion;

public class PowerModulo {

    public static double myPow(double x, int n, int p) {
        if (n == 0){
            return 1;
        }

        if (n < 0){
            x = 1 / x;
            n = -n;
        }
        double smallans = x * myPow(x, n -1, p);
        return smallans % p;
    }

    public static void main(String[] args) {
        System.out.println(myPow( 2.00000, 10, 500));
    }
}