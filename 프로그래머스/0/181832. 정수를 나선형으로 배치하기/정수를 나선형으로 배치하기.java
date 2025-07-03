class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] dx = {0,1,0,-1};  //시계방향(우->하->좌->상)
        int[] dy = {1,0,-1,0};
        boolean[][] visited = new boolean[n][n];  //방문 배열
        
        int x =0, y = 0, dir = 0;
        for(int k=1; k<=n*n; k++){
            answer[x][y] = k;
            visited[x][y] = true;
            int nx = x+dx[dir];
            int ny = y+dy[dir];
            //방향 전환 = 벽이거나 이미 방문
            if(nx<0 || nx>=n || ny<0 || ny>=n || visited[nx][ny]){
                dir = (dir+1)%4;    //0->1->2->3
                nx = x+dx[dir];
                ny = y+dy[dir];
            }
            x=nx;
            y=ny;
        }
        return answer;
    }
}