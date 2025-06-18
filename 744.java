class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0,e=letters.length-1;
        int m=0;
        if(target<letters[s]) return letters[s];
        if(target>=letters[e]) return letters[s];
        while(s<=e){
            m=(e+s)/2;
            if(letters[m]==target){
                if( m+1<letters.length) {
                    while(letters[m]==letters[m+1]){
                        m++;
                    }
                    return letters[m+1];
                }
                return letters[m];
            } 
            else if(letters[m]<target){
                s=m+1;
            }
            else if(letters[m]>target){
                e=m-1;
            }
        }
        return letters[s];
    }
}
