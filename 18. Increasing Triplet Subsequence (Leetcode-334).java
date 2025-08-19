import java.util.*;
class Solution 
{
    public boolean increasingTriplet(int[] nums) 
  {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int ele = nums[i];

            if(first>=ele)
            {
                first = ele;
            }else if(second>=ele){
                second = ele;
            }else{
                third = ele;
                return true;
            }
        }return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        boolean result = sol.increasingTriplet(nums);
        if(result) 
        {
            System.out.println("The array contains an increasing triplet subsequence.");
        }else{
            System.out.println("The array does not contain an increasing triplet subsequence.");
        }sc.close();
    }
}
