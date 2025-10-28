import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }else if (root.left == null && root.right == null) {
            ans.add("" + root.val);
            return ans;
        }
        List<String> leftAns = binaryTreePaths(root.left);
        List<String> rightAns = binaryTreePaths(root.right);
        for (String str : leftAns) {
            ans.add(root.val + "->" + str);
        }
        for(String str : rightAns) {
            ans.add(root.val + "->" + str);
        }return ans;
    }
}
public class Main {
    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();
            if (i < nodes.length && !nodes[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(current.left);
            }i++;
            if (i < nodes.length && !nodes[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(current.right);
            }i++;
        }return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tree nodes in level order (use 'null' for empty nodes):");
        String input = sc.nextLine();
        String[] nodes = input.split(" ");

        TreeNode root = buildTree(nodes);
        Solution sol = new Solution();
        List<String> result = sol.binaryTreePaths(root);

        System.out.println("All root-to-leaf paths:");
        for (String path : result) {
            System.out.println(path);
        }sc.close();
    }
}
