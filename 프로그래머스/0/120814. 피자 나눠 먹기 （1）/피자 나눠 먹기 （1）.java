class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = n / 7;
        int num2 = n % 7;
        if(num2 != 0 && num2 < 7) {
            answer = num1 + 1;
        }else if(num2 == 0) {
            answer = num1;
        }
        return answer;
    }
}