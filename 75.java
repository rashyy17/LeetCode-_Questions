class Solution {
    public void sortColors(int[] values) {
        int low = 0, mid = 0, high = values.length - 1;

        while(mid <= high) {
            if(values[mid] == 0) {
                int temp = values[low];
                values[low] = values[mid];
                values[mid] = temp;
                low++;
                mid++;
            }
            else if(values[mid] == 1) {
                mid++;
            }
            else {
                int temp = values[mid];
                values[mid] = values[high];
                values[high] = temp;
                high--;
            }
        }
    }
}
