package Recursion;

public class ArraySorted {

    public static boolean arraySortedOrNot(int []arr, int n){
        if (n == 0 || n == 1){
            return true;
        }

        if (arr[n - 1] < arr[n -2]){
            return false;
        }
        return arraySortedOrNot(arr, n -1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6};
        System.out.println(arraySortedOrNot(arr, arr.length));
    }

}
