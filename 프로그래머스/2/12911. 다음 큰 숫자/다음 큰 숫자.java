class Solution {
    public int solution(int n) {
        int answer = 0;
        //n 2진수의 1의 개수 구하기 : Integer.bitCount() 최고
        int cnt = Integer.bitCount(n);
        
        //다음 큰 숫자
        int num = n;
        int num_cnt = 0;
        while(cnt!=num_cnt){
            num += 1;
            num_cnt = Integer.bitCount(num);
        }
        return num;
    }
}