package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WaveArray {

    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();

        for (int i = 1; i < n; i+=2) {
            swap(A, i, i-1);
        }
        return A;
    }

    private static void swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        ArrayList<Integer> ans = wave(list);

        System.out.println(ans);

    }
}
