//done for acc2 cat2

import java.util.*;

class Solution {
    public boolean canFinish(int totalCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int index = 0; index < totalCourses; index++) {
            graph.add(new ArrayList<>());
        }

        int[] indegree = new int[totalCourses];

        for (int[] pair : prerequisites) {
            int course = pair[0];
            int prereq = pair[1];
            graph.get(prereq).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int index = 0; index < totalCourses; index++) {
            if (indegree[index] == 0) {
                queue.offer(index);
            }
        }

        int completed = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            completed++;

            for (int neighbor : graph.get(current)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return completed == totalCourses;
    }
}
