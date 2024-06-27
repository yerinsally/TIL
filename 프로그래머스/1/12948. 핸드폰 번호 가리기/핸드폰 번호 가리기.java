class Solution {
    public String solution(String phone_number) {
        String answer = "";

        char[] array = phone_number.toCharArray();
        int num = phone_number.length() - 4;
        for(int i=0; i<num; i++) {
            answer += "*";
        }
        answer += phone_number.substring(num);
        return answer;
    }
}
//자바에서는 문자열 곱하기 안됨..