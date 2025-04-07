import java.io.*;
import java.util.*;

//DFS : 섬인 곳만 탐색해나가기
//여러 개의 테스트케이스를 읽고 처리하는 반복 루프!
public class Main {
    static int w,h;
    static int[][] map;
    static boolean[][] visited;
    //8방향 이동(상하좌우 + 대각선)
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        while(true){
            st  = new StringTokenizer(br.readLine()," ");
            w = Integer.parseInt(st.nextToken());    //너비
            h = Integer.parseInt(st.nextToken());    //높이
            if(w==0 && h==0){    //종료조건
                break;
            }
            map = new int[h][w];
            visited = new boolean[h][w];
            
            //섬 바다 지도 입력받기
            for(int i=0; i<h; i++){
                st = new StringTokenizer(br.readLine()," ");
                for(int j=0; j<w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            //DFS 탐색 (섬 개수 초기화)
            int count = 0;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if(!visited[i][j] && map[i][j]==1){
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void dfs(int x, int y){
        visited[x][y] = true;
        
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<h && ny>=0 && ny<w){
                if(!visited[nx][ny] && map[nx][ny]==1){
                    dfs(nx, ny);
                }
            }
        }
    }
}