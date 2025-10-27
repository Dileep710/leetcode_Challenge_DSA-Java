import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }result.add(level);
        }return result;
    }
}
public class Main {
    // Helper method to build a binary tree from user input (level order)
    public static TreeNode buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }i++;
        }return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the tree:");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        System.out.println("Enter the node values (use -1 for null):");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == -1) {
                arr[i] = null;
            } else {
                arr[i] = val;
            }
        }
        TreeNode root = buildTree(arr);
        Solution sol = new Solution();
        List<List<Integer>> ans = sol.levelOrder(root);
        System.out.println("Level Order Traversal:");
        for (List<Integer> level : ans) {
            System.out.println(level);
        }sc.close();
    }
}
