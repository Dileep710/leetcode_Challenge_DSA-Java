import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
    
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        sc.close();
    }
}
class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] answer = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {   
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}
