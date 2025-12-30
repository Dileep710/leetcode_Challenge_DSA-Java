class Solution
{
    int maxDepth = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root)
    {
        dfs(root, 0);
        return sum;
    }
    public void dfs(TreeNode root, int depth) {
        if(root == null) return;
        if(depth > maxDepth){
            maxDepth = depth;
            sum = root.val;
        }
        else if(depth == maxDepth){
            sum += root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
