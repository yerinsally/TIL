class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(char str : my_string.toCharArray()){
            String s = Character.toString(str);
            answer += s.repeat(n);
        }
        return answer;
    }
}