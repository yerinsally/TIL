class Solution {
    public int solution(String[][] board, int h, int w) {
        //board의 길이 저장
        int n = board.length;
        //같은 색으로 색칠된 칸의 개수
        int count = 0;
        //h,w의 변화량
        int dh[] = {1,-1,0,0};
        int dw[] = {0,0,1,-1};
        
        for(int i=0; i<4; i++){
            int h_check = h + dh[i];
            int w_check = w + dw[i];
            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n && board[h][w].equals(board[h_check][w_check])){
            //문자열 비교는 equals ..
                count += 1;
            }
        }
        return count;
    }
}