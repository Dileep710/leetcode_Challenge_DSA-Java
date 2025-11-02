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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && root.val == targetSum) return true;
        boolean ans1 = hasPathSum(root.left, targetSum - root.val);
        boolean ans2 = hasPathSum(root.right, targetSum - root.val);
        return ans1 || ans2;
    }
}
public class Main {
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode curr = queue.poll();

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(curr.left);
            }i++;
            if (i < values.length && !values[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(curr.right);
            }i++;
        }return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree nodes in level order (use 'null' for empty nodes):");
        String input = sc.nextLine();
        String[] values = input.split(" ");

        TreeNode root = buildTree(values);
        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();
        Solution sol = new Solution();
        boolean result = sol.hasPathSum(root, targetSum);
        System.out.println("Has path sum = " + result);
    }
}
