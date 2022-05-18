import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public boolean isValidBST(TreeNode root) {
        List<Integer> inorderList = new ArrayList<Integer>();
        TreeNode cursor = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        double inorder = -Double.MAX_VALUE;
        while (cursor != null || !stack.isEmpty()) {
            if (cursor != null) {
                stack.push(cursor);
                cursor = cursor.left;
            } else {
                cursor = stack.pop();
                if (cursor.val <= inorder) {
                    return false;
                }
                inorderList.add(cursor.val);
                inorder = cursor.val;
                cursor = cursor.right;
            }
        }
        return true;
    }
}