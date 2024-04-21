package Recursion;

public class Test {
    public static void main(String[] args) {
        fun(4);
    }

    public static void fun(int n){
      if (n > 0){
          System.out.println(n);
          fun(n-1);
      }
    }
}
