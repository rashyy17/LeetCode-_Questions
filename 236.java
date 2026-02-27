/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root== p||root==q) return root;
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l==null && r==null) return null;
        if(l==null){
            return r;
        }
        if(r==null){
            return l;
        }
        return root;
    }
}


/// approach in my own words:

// 1. search for both nodes normally, separately. --o(n)
//    add paths of each in separate lists.
//    and then check both the lists one by one.
//    until they have the same node, return that last node.

// 2.(like code) recursive approach,
//   check left and right of each node.
//   if(node is p or q), return node
//   if(node.left is null and node.right isnt), return node.right
//   same otherway too
//   if both (node.left is not null and node.right is not null) return root itself.


  
  


  
