/**
 * https://leetcode.com/problems/merge-two-binary-trees/#/description
 */
public class Easy_617_MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // if both are null, assign merge tree to null
        if (t1 == null && t2 == null) return null;
        // if t1 or t2 is null, add 0
        int sum = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode tSum = new TreeNode(sum); // declare locally to prevent overwriting
        // pass null if either == null to avoid nullpointerexception
        tSum.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        tSum.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        return tSum;
    }

//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        // if both are null, assign merge tree to null
//        if (t1 == null && t2 == null) return null;
//        // if t1 or t2 is null, add 0
//        int sum = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
//        TreeNode tSum = new TreeNode(sum); // declare locally to prevent overwriting
//        // pass null if either == null to avoid nullpointerexception
//        tSum.right = mergeTrees(t1.right, t2.right);
//        tSum.left = mergeTrees(t1.left, t2.left);
//        return tSum;
//    }

    public static void main(String[] args) {
        // tests
    }
}
