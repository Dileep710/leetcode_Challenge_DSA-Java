import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val)
    {
        this.val = val;
    }
}
class Solution{
    public TreeNode sortedArrayToBST(int[] nums)  return helper(nums, 0, nums.length - 1);
    public TreeNode helper(int[] nums, int start, int end)
    {
        if(start > end) return null;

        int mid =(start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);
        return root;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        TreeNode root = sol.sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}
