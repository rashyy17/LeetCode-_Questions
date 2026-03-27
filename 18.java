import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] values, int target) {
        Arrays.sort(values);
        List<List<Integer>> result = new ArrayList<>();
        int length = values.length;

        for (int first = 0; first < length - 3; first++) {
            if (first > 0 && values[first] == values[first - 1]) continue;

            for (int second = first + 1; second < length - 2; second++) {
                if (second > first + 1 && values[second] == values[second - 1]) continue;

                int left = second + 1;
                int right = length - 1;

                while (left < right) {
                    long sum = (long) values[first] + values[second] + values[left] + values[right];

                    if (sum == target) {
                        result.add(Arrays.asList(
                                values[first], values[second], values[left], values[right]
                        ));

                        left++;
                        right--;

                        while (left < right && values[left] == values[left - 1]) left++;
                        while (left < right && values[right] == values[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
