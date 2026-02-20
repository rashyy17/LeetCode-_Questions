/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int d=0;
    public int maxPathSum(TreeNode root) {
        d=Integer.MIN_VALUE;
        trav(root);
        return d;
    }
    public int trav(TreeNode root){
        if(root==null) return 0;
        int l = Math.max(0, trav(root.left));
        int r = Math.max(0, trav(root.right));
        int v=root.val;
        d=Math.max(d,l+r+v);
        return v+Math.max(l,r);
    }
}
