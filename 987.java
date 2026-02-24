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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();

        Queue<Object[]> q=new LinkedList<>();
        q.offer(new Object[]{root,0,0});
        if(root==null) return res;
        while(!q.isEmpty()){
            Object[] current = q.poll();
            TreeNode node = (TreeNode) current[0];
            int column = (int) current[1];
            int row = (int) current[2];
            map.putIfAbsent(column, new TreeMap<>());
            map.get(column).putIfAbsent(row, new PriorityQueue<>());
            map.get(column).get(row).offer(node.val);
            if (node.left != null)
                q.offer(new Object[]{node.left, column - 1, row + 1});
            if (node.right != null)
                q.offer(new Object[]{node.right, column + 1, row + 1});
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> rows:map.values()){//for each col
        List<Integer> columnList =new ArrayList<>();
            for (PriorityQueue<Integer> nodes : rows.values()){//for each row
                while (!nodes.isEmpty()){
                    columnList.add(nodes.poll());
                }
            }
            res.add(columnList);
        }
        return res;
    }
}
