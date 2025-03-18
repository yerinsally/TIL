class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int zero = 0;
        int cnt = 0;
        String bin = s;     //초기 문자열 그래도 사용
        
        //1. x의 모든 0 제거
        //2. (x의 길이)를 2진법 표현
        while(!bin.equals("1")){
            int not_zero = 0;
            for(char c : bin.toCharArray()){
            if(c!='0'){
                not_zero++;
                }
            }
            zero += bin.length()-not_zero;
            bin = Integer.toBinaryString(not_zero);
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zero;
        return answer;
    }
}