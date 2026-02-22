class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean o = true;

        while (!q.isEmpty()) {
            int s = q.size();
            LinkedList<Integer> list = new LinkedList<>();

            for (int i = 0; i < s; i++) {
                TreeNode curr = q.poll();

                if (o) list.addLast(curr.val);
                else list.addFirst(curr.val);

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            res.add(list);
            o = !o;
        }

        return res;
    }
}
