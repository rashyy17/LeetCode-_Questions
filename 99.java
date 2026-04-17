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
Only Two nodes have to switched to make BST correct.
 
    So, two possible cases: i) Both wrong values are next to each other.   ex. 1,2,4,3,5,6 (3 and 4)
                            ii) Both values are not next to each other.( far apart)   ex. 1,6,3,4,5,2 (6 and 2)

    Common part of solution (inorder traversal gives sorted array intuition):
        have 3 nodes: first, second and last. 
        prev will store last node and will help identify wrong node (prev.val<root.val)
        
                                                                    
    In case i) so both(prev and root) will be stored in first and second respectively. last will obv remain null.
    In case ii)initially,  both(prev and root) will be stored in first and second respectively. when next element found wrong, 
    that root is stored in last(variable).
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
                l=root;
            }
        }
        prev=root;
        inorder(root.right);
    }

}
