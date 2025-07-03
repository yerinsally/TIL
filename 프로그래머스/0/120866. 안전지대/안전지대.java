class Solution {
    public int solution(int[][] board) {
        int[] dx = {1,-1,0,0,1,1,-1,-1};   //상화좌우+대각선 이동
        int[] dy = {0,0,1,-1,1,-1,1,-1};
        int n = board.length;
        
        //1. 위험지역(1) 찾기
        boolean[][] danger = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    //해당 위험지역(1) danger 표시
                    danger[i][j] = true;
                    //위험지역 주변 danger 표시
                    for(int k=0; k<8; k++){
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        //배열 범위 체크!!
                        if(nx>=0 && nx<n && ny>=0 && ny<n){
                            danger[nx][ny]  = true;
                        }
                    }
                }
            }
        }
        //2. 안전지대 개수 카운트(false)
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!danger[i][j]){
                    answer++;
                }
            }
        }
        return answer;
    }
}