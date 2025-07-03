import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i=0, j=0, k=0;
        for (int a=0 ; a<commands.length; a++) {
            //[i,j,k] : 인덱스이므로 i-1,j-1
            i = commands[a][0]-1; 
            j = commands[a][1];
            k = commands[a][2];
            //배열 복사 : Arrays.copyOfRange(배열,i부터,j-1까지)
            int[] new_arr = Arrays.copyOfRange(array,i,j);
            Arrays.sort(new_arr);
            answer[a] = new_arr[k-1];
        }
        return answer;
    }
}