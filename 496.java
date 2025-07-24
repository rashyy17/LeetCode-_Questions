class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums2){
            while(!s.isEmpty() && n>s.peek()){
                map.put(s.pop(),n);
            }
            s.push(n);
        }
        int res[]=new int[nums1.length];
        while(!s.isEmpty()){
            map.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
