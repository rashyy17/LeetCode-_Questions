class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int vertices = graph.length;

        ArrayList<Integer>[] reverse = new ArrayList[vertices];
        for (int index = 0; index < vertices; index++) {
            reverse[index] = new ArrayList<>();
        }

        int[] outDegree = new int[vertices];

        for (int node = 0; node < vertices; node++) {
            outDegree[node] = graph[node].length;

            for (int neighbor : graph[node]) {
                reverse[neighbor].add(node);
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int node = 0; node < vertices; node++) {
            if (outDegree[node] == 0) {
                queue.offer(node);
            }
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int current = queue.poll();
            answer.add(current);

            for (int previous : reverse[current]) {
                outDegree[previous]--;

                if (outDegree[previous] == 0) {
                    queue.offer(previous);
                }
            }
        }

        Collections.sort(answer);
        return answer;
    }
}
