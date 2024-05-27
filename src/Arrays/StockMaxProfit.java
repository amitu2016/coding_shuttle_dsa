package Arrays;

public class StockMaxProfit {

    public int maxProfit(int[] prices)
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(Integer price: prices){
            //Update minimum price if less price is found
            if(price < minPrice){
                minPrice = price;
            }else {
                //Else calculate the profit and update maxProfit
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {10, 19, 1, 30, 32};
        StockMaxProfit obj = new StockMaxProfit();
        int ans = obj.maxProfit(arr);
        System.out.println(ans);
    }
}
