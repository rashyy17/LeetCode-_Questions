import java.util.*;

class Solution {
    static class Pair {
        TreeNode node;
        long index;
        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0));

        int maximumWidth = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            long firstIndex = queue.peek().index;
            long lastIndex = firstIndex;

            for (int count = 0; count < levelSize; count++) {
                Pair current = queue.poll();
                lastIndex = current.index;

                if (current.node.left != null)
                    queue.offer(new Pair(current.node.left, 2 * (current.index - firstIndex)));

                if (current.node.right != null)
                    queue.offer(new Pair(current.node.right, 2 * (current.index - firstIndex) + 1));
            }

            int currentWidth = (int)(lastIndex - firstIndex + 1);
            maximumWidth = Math.max(maximumWidth, currentWidth);
        }

        return maximumWidth;
    }
}
