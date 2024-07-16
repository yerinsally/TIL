import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int left = commands[i][0]-1;     //index = 1
            int right = commands[i][1]-1;    //index = 4
            int k = commands[i][2]-1;        //index = 2
            
            int len = right-left+1;          //자른 배열 길이 = 4
            int[] sub = new int[len];
            for(int j=left; j<=right; j++){  //1부터 4까지 순회
                sub[j-left] = array[j];      //자른 배열의 0~3 인덱스 = j-left
            }
            Arrays.sort(sub);
            answer[i] = sub[k];
        }
        return answer;
    }
}