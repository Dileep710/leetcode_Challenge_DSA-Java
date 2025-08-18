import java.util.*;
class Solution 
{
    public int maxArea(int[] height) 
  {
        int start = 0;
        int end = height.length - 1;
        int maxCap = 0;
        while(start < end) 
        {
            int h = Math.min(height[start], height[end]);
            int width = end - start;
            int currCap = h * width;
            maxCap = Math.max(currCap, maxCap);
            if(height[start] < height[end]) 
            {
                start++;
            }else{
                end--;
            }
        }return maxCap;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        System.out.println("Enter the heights:");
        for(int i = 0; i < n; i++) 
        {
            height[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.maxArea(height);
        System.out.println("Maximum Water Container Area: " + result);
        sc.close();
    }
}
