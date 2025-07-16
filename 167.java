class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int m=numbers[i]+numbers[j];
            if(m>target) j--;
            else if(m<target) i++;
            else break;
        }
        return new int[] {i+1,j+1};
    }
}
