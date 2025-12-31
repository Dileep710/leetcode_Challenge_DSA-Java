import java.util.*;
class Solution
{
    public int maxProfit(int[] prices)
    {
        int n = prices.length;
        int[] maxValue = new int[n];
        maxValue[n-1] = prices[n-1];
        for(int i=n-2;i>=0;i--)
            maxValue[i] = Math.max(maxValue[i + 1], prices[i]);
        int ans = 0;
        for(int i=0; i <prices.length; i++){
            int currPro = maxValue[i]-prices[i];
            ans = Math.max(ans,currPro);
        }return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maxProfit(prices);
        System.out.println(result);
        sc.close();
    }
}
