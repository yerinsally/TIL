class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int same = 0;   //로또 번호 & 당첨 번호 같은 개수
        int zero = 0;   //로또 번호의 0의 개수
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    same++;
                }
            }
            if(lottos[i]==0){
                zero++;
            }
        }
        //순위 배열
        int[] answer = new int[2];
        int[] score = {same+zero, same};
        for(int i=0; i<2; i++){
            if(score[i]==6) answer[i]=1;
            if(score[i]==5) answer[i]=2;
            if(score[i]==4) answer[i]=3;
            if(score[i]==3) answer[i]=4;
            if(score[i]==2) answer[i]=5;
            if(score[i]==1 || score[i]==0) answer[i]=6;;
        }
        return answer;
    }
}