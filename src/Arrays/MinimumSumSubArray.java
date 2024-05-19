package Arrays;

public class MinimumSumSubArray {

    public int minSubArrayLen(int K, int[] A)
    {
       int l = 0, r = 0, currSum = 0;
       int minLength = Integer.MAX_VALUE;
       int n = A.length;

       while(r < n){
          currSum += A[r];
          while (currSum >= K){
              minLength = Math.min(minLength, r - l + 1);
              currSum -= A[l];
              l++;
          }
          r++;
       }

    if (minLength == Integer.MAX_VALUE){
        return 0;
    }

    return  minLength;
    }


    public static void main(String[] args) {
        int[] A = {2,3,1,2,4,3};
        int K = 7;
        MinimumSumSubArray obj = new MinimumSumSubArray();
        int ans = obj.minSubArrayLen(K,A);
        System.out.println(ans);
    }
}
