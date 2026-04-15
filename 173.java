// do like inorder traversal.

//     Use Stack-> Space Complexity O(h)-> h is max height of tree
    
//     When inititializing Stack (BSTIterator(root)) -->push root,then all nodes to the left of it
//     When returning next()-> pop and return. Also check if popped node has a right child.
//     When returning hasNext()->check if stack empty or not. if its empty, return false.

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
class BSTIterator {
    Stack<TreeNode> st=new Stack<>();
    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }
    
    public int next() {
        TreeNode n=st.pop();
        pushLeft(n.right);
        return n.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    public void pushLeft(TreeNode root) {
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
