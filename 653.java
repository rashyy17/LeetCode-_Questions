//1st Approach: NOT MOST OPTIMIZED CUZ SC=O(n)
// DO inorder traversal and store elements in a List. (This is bst so,Inorder traversal stores it in ascending order)
// Now, apply two sum approach to see if two elememts give sum k(use two pointer at beginning and end)
  

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        inorder( root,l);
        int left=0,r=l.size()-1;
        while(left<r){
            int s=l.get(left)+l.get(r);
            if(s>k){
                r=r-1;
            }
            else if(s<k){
                left=left+1;
            }
            else return true;
        }
        return false;
    }

    public void inorder(TreeNode root, List<Integer> l) {
        if(root==null) return;
        inorder(root.left,l) ;
        l.add(root.val);
        inorder(root.right,l) ;
    }
}




//2nd Approach: Use Binary Interator concept (Leetcode 173) SC=O(H) , H is height of bst
// [Using Stack to store data for inorder traversal] revise 173
//   here use two similar stacks (both implemenet inorder traversal only but in opposite sequence.
//   bstIterator is left node right
//   bstIteratorUlta is right node left
//   so then we perform 2 sum login but l=nextFromLeft and r=nextFromRight
//   we sum them and compare with k


class Solution {
    public class bstIterator{
        static Stack<TreeNode> st=new Stack<>();
        bstIterator(TreeNode root){
            pushLeft(root);
        }
        public static int nextFromLeft(){
            TreeNode temp=st.pop();
            pushLeft(temp.right);
            return temp.val;
        }
        public static void pushLeft(TreeNode root){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
        }
        public static boolean hasNextFromLeft(){
            return !st.isEmpty();
        }
    }
    public class bstIteratorUlta{
        static Stack<TreeNode> st=new Stack<>();
        bstIteratorUlta(TreeNode root){
            pushRight(root);
        }
        public static int nextFromRight(){
            TreeNode temp=st.pop();
            pushRight(temp.left);
            return temp.val;
        }
        public static void pushRight(TreeNode root){
            while(root!=null){
                st.push(root);
                root=root.right;
            }
        }
        public static boolean hasNextFromRight(){
            return !st.isEmpty();
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        bstIterator b1=new bstIterator(root);
        bstIteratorUlta b2=new bstIteratorUlta(root);
        int l=b1.nextFromLeft();
        int r=b2.nextFromRight();
        while(l!=r && b1.hasNextFromLeft() && b2.hasNextFromRight()){
            int s=l+r;
            if(s>k){
                r=b2.nextFromRight();
                
            }
            else if(s<k){
                l=b1.nextFromLeft();
            }
            else return true;
        }
        return false;
    }

    
}
