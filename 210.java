class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int course = 0; course < numCourses; course++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for (int[] prerequisite : prerequisites) {

            int course = prerequisite[0];
            int dependsOn = prerequisite[1];

            graph.get(dependsOn).add(course);

            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int course = 0; course < numCourses; course++) {

            if (indegree[course] == 0) {
                queue.add(course);
            }
        }

        int[] order = new int[numCourses];

        int index = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            order[index++] = current;

            for (int neighbor : graph.get(current)) {

                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        if (index == numCourses) {
            return order;
        }

        return new int[0];
    }
}
