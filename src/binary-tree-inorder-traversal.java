import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// @solution-sync:begin
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<Integer>();
        TreeNode cursor = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
  
        while (cursor != null || !stack.isEmpty()) {
            if (cursor != null) {
                stack.push(cursor);
                cursor = cursor.left;
            } else {
                cursor = stack.pop();
                inorderList.add(cursor.val);
                cursor = cursor.right;
            }
        }
        return inorderList;
    }
}