// if both heads null, return true.
// if only one of the heads is null, return false.
// if values are not same, return false. 
// run again on left and right branches
class Solution {
    boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
