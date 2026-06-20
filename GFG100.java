Array
1. Pair with the given Sum
// class Solution {
//     boolean twoSum(int arr[], int target) {
//         // code here
//         HashMap<Integer,Integer> hm=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//             if(hm.containsKey(target-arr[i])){
//                 return true;
//             }
//             hm.put(arr[i],i);
//         }
//         return false;
//     }
}
2. Best Time to Buy and Sell Stock
// class Solution {
//     public int maxProfit(int[] prices) {
//         // Code here
//         int min=Integer.MAX_VALUE;
//         int prof=0;
//         for(int i=0;i<prices.length;i++){
//             min=Math.min(min,prices[i]);
//             prof=Math.max(prof,prices[i]-min);
//         }
//         return prof;
//     }
// }
3. Product of Array Except Self
// class Solution {
//     public static int[] productExceptSelf(int arr[]) {
//         // code here
//         int p=1;
//         boolean z=false;
//         int c=0;
//         for(int i:arr){
//             if(i==0) {
//                 z=true;
//                 c++;
//                 continue;
//             }
//             p*=i;
//         }
//         int ans[]=new int[arr.length];
//         if(c>1){
//             return ans;
//         }
        
//         for(int i=0;i<arr.length;i++){
//             if(z && arr[i]==0){
//                 ans[i]=p;
//             }
//             else if(z && arr[i]!=0) ans[i]=0;
//             else ans[i]=p/arr[i];
//         }
//         return ans;
//     }
// }

4. Maximum Subarray
// class Solution {
//     int maxSubarraySum(int[] arr) {
//         // Code here
//         int max=Integer.MIN_VALUE;
//         int sum=0;
//         for(int n:arr){
//             int curr=sum+n;
//             if(curr>n){
//                 sum+=n;
//             }
//             else{
//                 sum=n;
//             }
//             max=Math.max(max,sum);
//         }
//         return max;
//     }
// }

5. Container With Most Water
// import java.util.*;
// class GfG {
//     static int maxWater(int[] arr) {
//         int n = arr.length;
//         int res = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
              
//                 // calculate the amount of water
//                 int amount = 
//                     Math.min(arr[i], arr[j]) * (j - i);
              
//                 // keep track of maximum amount of water
//                 res = Math.max(amount, res);
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
//         System.out.println(maxWater(arr));
//     }
// }
**6. Factorial of a large number
7. Trapping Rain Water
// class Solution {
//     public int maxWater(int arr[]) {
//         // code here
//         int ans=0;
//         int lm=0;
//         int rm=0;
//         int n=arr.length;
//         int leftm[]=new int[n];
//         int rightm[]=new int[n];
//         for(int i=0;i<n;i++){
//             leftm[i]=lm;
//             lm=Math.max(lm,arr[i]);
//         }
//         for(int i=n-1;i>=0;i--){
//             rightm[i]=rm;
//             rm=Math.max(rm,arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             int a=Math.min(leftm[i],rightm[i])-arr[i];
//             if(a>0) ans+=a;
            
//         }
//         return ans;
//     }
// }

8. Insert and Merge Intervals
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class GfG {

//     // Function to insert and merge intervals
//     static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
//         ArrayList<int[]> res = new ArrayList<>();
//         int i = 0;
//         int n = intervals.length;

//         // Add all intervals that come before the new interval
//         while (i < n && intervals[i][1] < newInterval[0]) {
//             res.add(intervals[i]);
//             i++;
//         }

//         // Merge all overlapping intervals with the new interval
//         while (i < n && intervals[i][0] <= newInterval[1]) {
//             newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
//             newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
//             i++;
//         }
//         res.add(newInterval);

//         // Add all the remaining intervals
//         while (i < n) {
//             res.add(intervals[i]);
//             i++;
//         }

//         // Return the result as a List<int[]>
//         return res;
//     }

//     public static void main(String[] args) {
//         int[][] intervals = {{1, 3}, {4, 5}, {6, 7}, {8, 10}};
//         int[] newInterval = {5, 6};

//         ArrayList<int[]> res = insertInterval(intervals, newInterval);
//         for (int[] interval : res) {
//             System.out.println(interval[0] + " " + interval[1]);
//         }
//     }
// }
9. Merge Intervals

Matrix
1. Spiral Matrix
2. Transpose of a matrix
3. Word Search

String
1. Longest Substring Without Repeating
2. Longest Repeating Character Replacement
3. Smallest window containing all characters

Bit Manipulations
1. Counting Bits
2. Missing Number (1 to n range)
3. Find XOR of all subsets of a set

Dynamic Programming & Greedy
1. Count ways to reach the n’th stair
2. 0/1 Knapsack Problem

Heap
1. Top K Frequent Elements
2. Connect n Ropes

Graph
4. Number of Islands
