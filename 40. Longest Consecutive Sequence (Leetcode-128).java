import java.util.*;
class Solution
{
    public int longestConsecutive(int[] nums)
    {
        if(nums.length == 0) return 0;
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int num : nums)
        {
            hm.put(num, false);
        }
        for(int key : hm.keySet())
        {
            if(!hm.containsKey(key - 1))
            {
                hm.put(key, true);
            }
        }
        int max = 0;
        for(int key : hm.keySet())
        {
            if(hm.get(key))
            {
                int k = 1;
                while(hm.containsKey(key + k))
                {
                    k++;
                }max = Math.max(max, k);
            }
        }return max;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length = " + result);
        sc.close();
    }
}
