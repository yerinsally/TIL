class Solution {
    public int solution(int num1, int num2) {
        int answer = (int)( ((double)num1/num2) * 1000);    // 정수/정수=정수이므로 double 강제 형 변환 필요
        return answer;
    }
}