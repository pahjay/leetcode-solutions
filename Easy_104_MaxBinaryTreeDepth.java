/**
 * Created by dev on 6/7/2017.
 */
public class Easy_104_MaxBinaryTreeDepth {
        int max = 0;
    public int maxDepth(TreeNode root) {
        if (root.left != null) {
            maxDepth(root.left, 1);
        }
        if (root.right != null) {
            maxDepth(root.right, 1);
        }


        return max;
    }

    private void maxDepth(TreeNode root, int depth) {
        if (depth > max) {
            max = depth;
        }
        if (root.left != null) {
            maxDepth(root.left, depth+1);
        }
        if (root.right != null) {
            maxDepth(root.right, depth+1);
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
