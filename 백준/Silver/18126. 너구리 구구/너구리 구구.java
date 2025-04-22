import java.io.*;
import java.util.*;

public class Main {
    static class Node {
        int room, dist;
        Node(int room, int dist) {
            this.room = room;
            this.dist = dist;
        }
    }

    static List<List<Node>> tree = new ArrayList<>();
    static boolean[] visited;
    static long maxDist = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            tree.get(A).add(new Node(B, C));
            tree.get(B).add(new Node(A, C));
        }

        visited = new boolean[N + 1];
        visited[1] = true; // 입구 방문 처리
        dfs(1, 0);

        System.out.println(maxDist); // 트리 지름 아님!! 1번에서 가장 먼 거리
    }

    public static void dfs(int current, long sum) {
        maxDist = Math.max(maxDist, sum);

        for (Node next : tree.get(current)) {
            if (!visited[next.room]) {
                visited[next.room] = true;
                dfs(next.room, sum + next.dist);
            }
        }
    }
}
