/**
 * https://leetcode.com/problems/convert-bst-to-greater-tree/#/description
 */
public class Medium_538_ConvertBSTtoGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode root) {
        if (root == null) return;

        traverse(root.right); // traverse down higher tree first
        root.val += sum; // move down to bottom of tree and add values as you climb back up
        sum = root.val; // assign the new sum in that point
        traverse(root.left); //
    }
}
