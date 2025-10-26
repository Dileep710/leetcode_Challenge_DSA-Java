class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val)
    { 
        this.val = val; 
    }
    TreeNode(int val, TreeNode left, TreeNode right) { 
        this.val = val; 
        this.left = left; 
        this.right = right; 
    }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, List<Integer> list) {
        if(root == null) return;
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.val);
    }
}
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        Solution sol = new Solution();
        List<Integer> result = sol.postorderTraversal(root);
        System.out.println("Postorder Traversal: " + result);
    }
}
