class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;  // negatives can't be palindrome
        int val=x,rev=0;
        while(val>0){
            int last=val%10;
            rev=rev*10+last;
            val/=10;
        }

        return rev==x;
    }
}
