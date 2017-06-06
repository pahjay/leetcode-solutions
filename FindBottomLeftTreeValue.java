/**
 *  **** LeetCode Problem ****
 *  Find Bottom Left Tree Value
 *  https://leetcode.com/problems/find-bottom-left-tree-value/#/description
 *  **************************
 *  Rationale: recursive solution, if new row has been reached, then ans is set to that root val
 *  The root val is always going to be the left due to the way binary trees expand. If a right value exists
 *  at the lowest row, the curDepth will not be lower than the existing left node.
 */

public class FindBottomLeftTreeValue {
    int ans = 0, lowestDepth = 0;
    public int FindBottomLeftTreeValue(TreeNode root) {
        FindBottomLeftTreeValue(root);
        return ans;
    }

    private void FindBottomLeftTreeValue(TreeNode root, int curDepth) {
        if (lowestDepth < curDepth) { ans = root.val; lowestDepth = curDepth; }
        if (root.left != null) { FindBottomLeftTreeValue(root.left, curDepth+1); }
        if (root.right != null) { FindBottomLeftTreeValue(root.right, curDepth+1); }
    }

    public static void main(String[] args) {

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
