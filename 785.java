class Solution {
    public boolean isBipartite(int[][] graph) {
        int vertices = graph.length;

        int[] color = new int[vertices];

        for (int start = 0; start < vertices; start++) {

            if (color[start] != 0) {
                continue;
            }

            Queue<Integer> queue = new LinkedList<>();

            queue.add(start);

            color[start] = 1;

            while (!queue.isEmpty()) {

                int current = queue.poll();

                for (int neighbor : graph[current]) {

                    if (color[neighbor] == 0) {

                        color[neighbor] = -color[current];

                        queue.add(neighbor);

                    } else if (color[neighbor] == color[current]) {

                        return false;
                    }
                }
            }
        }

        return true;
    }
}
