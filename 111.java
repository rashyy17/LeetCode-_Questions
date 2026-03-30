class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        // If left child is null, check right subtree
        if (root.left == null) return minDepth(root.right) + 1;
        // If right child is null, check left subtree
        if (root.right == null) return minDepth(root.left) + 1;
        
        // If both children exist, take the minimum of both
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
