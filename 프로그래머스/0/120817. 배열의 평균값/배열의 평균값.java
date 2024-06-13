class Solution {
    public double solution(int[] numbers) {
        int sum = 0;    //초기화
        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        double answer = (double) sum / numbers.length;  //강제 타입 변환 필요
        return answer;
    }
}