class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int num = 0;        //약수의 개수 : 첫 for문 안에 선언해야함
            for(int j=1; j<=i; j++){
                if(i % j == 0){
                    num += 1;
                }
            }
            if(num % 2 == 0){
                answer += i;
            }else if(num % 2 != 0){
                answer -= i;
            }
        }
        return answer;
    }
}