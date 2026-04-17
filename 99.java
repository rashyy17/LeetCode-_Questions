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
    TreeNode f,s,l;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        
        inorder(root);
        if(l!=null){
            int t=f.val;
            f.val=l.val;
            l.val=t;
        }
        else{
            int t=f.val;
            f.val=s.val;
            s.val=t;
        }
    }
    public void inorder(TreeNode root) {
        if(root==null) return;
        inorder(root.left);
        if(prev.val>root.val){
           if(f==null){
            f=prev;
            s=root;
           }
            else{
                s=root;
            
            }
        }
        prev=root;
        inorder(root.right);
    }

}
