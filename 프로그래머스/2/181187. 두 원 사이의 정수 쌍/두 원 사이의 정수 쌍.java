class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        for(int i=1; i<=r2; i++){
            //r1 기준 : i가 r1보다 작으면 (floor(r2의 y좌표)-ceil(r1의 y좌표))의 제곱근+1
            //r2의 y좌표 = Math.sqrt(Math.pow(r2,2)-Math.pow(i,2))
            if(i<r1){
                answer += Math.floor(Math.sqrt(Math.pow(r2,2)-Math.pow(i,2)))-Math.ceil(Math.sqrt(Math.pow(r1,2)-Math.pow(i,2)))+1;
            }else{  //r1 기준 : i가 r1보다 크면 floor(r2의 y좌표)+1
                answer += Math.floor(Math.sqrt(Math.pow(r2,2)-Math.pow(i,2)))+1;
            }
        }
        //4사분면이므로 4배
        return answer*4;
    }
}