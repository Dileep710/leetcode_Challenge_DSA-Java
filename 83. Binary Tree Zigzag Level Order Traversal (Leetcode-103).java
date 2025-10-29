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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        List<Integer> currAns = new ArrayList<>();
        Stack<TreeNode> main = new Stack<>();
        Stack<TreeNode> helper = new Stack<>();
        int level = 0;
        main.push(root);
        while(main.size() > 0) {
            TreeNode currNode = main.pop();
            currAns.add(currNode.val);
            if(level == 0) {
                if(currNode.left != null) {
                    helper.push(currNode.left);
                }
                if(currNode.right != null) {
                    helper.push(currNode.right);
                }
            }else{
                if(currNode.right != null) {
                    helper.push(currNode.right);
                }
                if (currNode.left != null) {
                    helper.push(currNode.left);
                }
            }
            if(main.size() == 0) {
                ans.add(currAns);
                currAns = new ArrayList<>();
                level = 1 - level;
                main = helper;
                helper = new Stack<>();
            }
        }return ans;
    }
}
public class Main {
    public static TreeNode buildTree(String[] nodes) {
        if(nodes.length == 0 || nodes[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while(!queue.isEmpty() && i < nodes.length) {
            TreeNode curr = queue.poll();
            if(!nodes[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.left);
            }i++;
            if(i < nodes.length && !nodes[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(curr.right);
            }i++;
        }return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tree nodes in level order (use 'null' for missing nodes):");
        String input = sc.nextLine();
        String[] nodes = input.trim().split("\\s+");
        TreeNode root = buildTree(nodes);
        Solution sol = new Solution();
        List<List<Integer>> result = sol.zigzagLevelOrder(root);

        System.out.println("Zigzag Level Order Traversal:");
        for(List<Integer> level : result) {
            System.out.println(level);
        }sc.close();
    }
}
