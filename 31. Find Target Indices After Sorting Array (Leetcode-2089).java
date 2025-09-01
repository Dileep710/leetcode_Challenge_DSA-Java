import java.util.*;
class Solution
{
    public List<Integer> targetIndices(int[] nums, int target)
    {
        int num = 0;
        int tcount = 0;
        for(int ele:nums)
        {
            if(ele == target)
            {
                tcount++;
            }else if(ele < target){
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(tcount > 0)
        {
            ans.add(num);
            num++;
            tcount--;
        }return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Solution sol = new Solution();
        List<Integer> result = sol.targetIndices(nums, target);
        System.out.println("Target indices: " + result);
    }
}
