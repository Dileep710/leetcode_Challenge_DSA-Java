import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
class Solution {
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return ans;
    }
    public void helper(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        helper(root.left, k);
        count = count + 1;
        if (count == k) {
            ans = root.val;
        }
        helper(root.right, k);
    }
}
public class Main {
    public static TreeNode insertLevelOrder(Integer[] arr, int i) {
        TreeNode root = null;
        if (i < arr.length && arr[i] != null) {
            root = new TreeNode(arr[i]);
            root.left = insertLevelOrder(arr, 2 * i + 1);
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.println("Enter node values (use -1 for null):");
        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = (val == -1) ? null : val;
        }
        TreeNode root = insertLevelOrder(arr, 0);
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is: " + result);
        sc.close();
    }
}
