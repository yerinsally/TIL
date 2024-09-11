class Solution {
    public long solution(long num) {
        int answer = 0;
        while(num != 1){
            if(num == 1){
                return 0;
            }else if(num%2 == 0){
                num /= 2;
            }else{
                num = num*3+1;
            }
            answer += 1;
            if(answer >= 500){
                return -1;
            }
        }
        return answer;
    }
}