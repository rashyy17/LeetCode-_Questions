class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int length = hand.length;
        if (length % groupSize != 0) return false;

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int card : hand) {
            frequency.put(card, frequency.getOrDefault(card, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(frequency.keySet());

        while (!minHeap.isEmpty()) {
            int first = minHeap.peek();

            for (int value = first; value < first + groupSize; value++) {
                if (!frequency.containsKey(value)) return false;

                frequency.put(value, frequency.get(value) - 1);

                if (frequency.get(value) == 0) {
                    if (value != minHeap.peek()) return false;
                    minHeap.poll();
                }
            }
        }

        return true;
    }
}
