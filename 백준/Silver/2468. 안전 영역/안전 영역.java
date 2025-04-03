import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0}; //상하좌우 이동
    static int[] dy = {0, 0, 1, -1}; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        
        //최소 및 최대 높이 찾기
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE; 
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                map[i][j] = sc.nextInt();
                minHeight = Math.min(minHeight, map[i][j]);
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }
        
        //안전 영역 개수의 최댓값 (모두 잠기지 않는 경우 대비)
        int maxSafeZones = 1; 
        for(int h=minHeight-1; h<=maxHeight; h++) { //비 높이를 변화시키며 탐색
            visited = new boolean[N][N];
            int count = 0;

            for(int i=0; i<N; i++) {
                for (int j=0; j<N; j++) {
                    if (map[i][j]>h && !visited[i][j]) { //물에 잠기지 않은 곳에서 새로운 영역 찾기
                        dfs(i, j, h);
                        count++;
                    }
                }
            }
            maxSafeZones = Math.max(maxSafeZones,count); //최댓값 업데이트
        }
        System.out.println(maxSafeZones);
    }

    //DFS 탐색
    static void dfs(int x, int y, int height) {
        visited[x][y] = true;
        for (int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];

            if (nx>=0 && nx<N && ny>=0 && ny<N) { //배열 범위 체크
                if (!visited[nx][ny] && map[nx][ny]>height) {
                    dfs(nx, ny, height);
                }
            }
        }
    }
}
