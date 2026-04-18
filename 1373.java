class Solution {
    private int maxSum = 0;

    class NewNode {
        int min, max, sum;
        NewNode(int min, int max, int sum) {
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    private NewNode helper(TreeNode root) {
        if (root == null)
            return new NewNode(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);

        NewNode left  = helper(root.left);
        NewNode right = helper(root.right);

        if (left.max < root.val && right.min > root.val) {
            int sum = left.sum + right.sum + root.val;
            maxSum = Math.max(maxSum, sum);  // ← track globally
            return new NewNode(
                Math.min(left.min, root.val),
                Math.max(right.max, root.val),
                sum
            );
        }
        // Invalid BST — sentinels ensure parent won't accept this subtree
        return new NewNode(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }

    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }
}
