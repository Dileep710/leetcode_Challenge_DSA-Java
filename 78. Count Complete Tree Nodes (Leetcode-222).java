import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftAns = countNodes(root.left);
        int rightAns = countNodes(root.right);
        return leftAns + rightAns + 1;
    }
}
public class Main {
    public static void main(String[] args) {
        /*
                  1
                 / \
                2   3
               / \   \
              4   5   6
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        int count = sol.countNodes(root);
        System.out.println("Total number of nodes in the tree: " + count);
    }
}
