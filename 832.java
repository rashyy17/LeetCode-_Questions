class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int l=image.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<(l+1)/2;j++){
                int t=image[i][j]^1;
                image[i][j]=image[i][l-j-1]^1;
                image[i][l-j-1]=t;
            }
        }
        return image;
    }
}
