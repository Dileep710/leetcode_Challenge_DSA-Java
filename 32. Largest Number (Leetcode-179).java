import java.util.*;
public class Solution
{
    public String largestNumber(int[] nums)
    {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            arr[i] = nums[i] + "";
        }
        Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length - 1; i >= 0; i--)
        {
            sb.append(arr[i]);
        }
        if(sb.charAt(0) == '0')
        {
            return "0";
        }else{
            return sb.toString();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        String result = sol.largestNumber(nums);
        System.out.println("Largest number formed: " + result);
    }
}
