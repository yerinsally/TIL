class Solution {
    public int solution(int n) {
        int answer = 0;
        //n을 연속간 자연수로 표현 
        for(int i=1; i<=n; i++){
            int num = n;    //초기값 설정
            for(int j=i; j<=n; j++){
                num -= j;
                if(num>0){
                    continue;
                }else if(num<0){
                    break;
                }else{
                    answer++;
                }
            }
        }
        return answer;
    }
}