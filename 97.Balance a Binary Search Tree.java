class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() 
    {}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right)
    {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution{
    List<Integer> inorderList = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root)
    {
        inorder(root);
        return buildBalancedBST(0, inorderList.size()-1);
    }
    public void inorder(TreeNode root){
        if(root ==null) return;
        inorder(root.left);
        inorderList.add(root.val);
        inorder(root.right);
    }
    public TreeNode buildBalancedBST(int start, int end) {
        if(start > end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(inorderList.get(mid));
        root.left = buildBalancedBST(start, mid-1);
        root.right = buildBalancedBST(mid+1, end);
        return root;
    }
}
