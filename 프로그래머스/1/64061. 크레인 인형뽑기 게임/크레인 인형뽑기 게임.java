import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        //터트려 사라진 인형의 개수 = stack에서 pop한 수x2
        int answer = 0;
        //인형은 stack에 쌓기
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                //인형이 존재하면 (0보다 크면)
                if(board[j][moves[i]-1] > 0){
                    if(!stack.empty() && stack.peek()==board[j][moves[i]-1]){
                        stack.pop();
                        answer++;
                    }else{
                        stack.push(board[j][moves[i]-1]);
                    }
                    //해당 인형 칸은 0으로 업데이트, 밑 칸 보지 않도록 break
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer*2;
    }
}