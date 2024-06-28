package Arrays;

public class IsRectangleOverlap {

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2)
    {
        // Check if one rectangle is to the left of the other
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0]) {
            return false;
        }

        // Check if one rectangle is above the other
        if (rec1[1] >= rec2[3] || rec2[1] >= rec1[3]) {
            return false;
        }

        // If none of the conditions above are met, the rectangles overlap
        return true;

    }

    public static void main(String[] args) {
        int[] rec1 = {2, 4, 10, 8};
        int[] rec2 = {1, 2, 6, 6};

        System.out.println(isRectangleOverlap(rec1, rec2));
    }
}
