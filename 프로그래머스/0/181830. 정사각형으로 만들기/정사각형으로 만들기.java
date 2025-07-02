class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int len1 = arr.length;      //행의 길이
        int len2 = arr[0].length;   //열의 길이
        if(len1>len2){  //1번
            answer = new int[len1][len1];
            for(int i=0; i<len1; i++){
                for(int j=0; j<len2; j++){
                    answer[i][j] = arr[i][j];
                }
                answer[i][len1-1] = 0;
            }
        }else if(len2>len1){  //2번
            answer = new int[len2][len2];
            for(int i=0; i<len1; i++){
                for(int j=0; j<len2; j++){
                    answer[i][j] = arr[i][j];
                }
                answer[len2-1][i] = 0;
            }
        }else{
            answer = arr;
        }
        return answer;
    }
}