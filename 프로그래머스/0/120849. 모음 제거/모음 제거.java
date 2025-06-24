class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char str : my_string.toCharArray()){
            if(str!='a' && str!='e' && str!='i' && str!='o' && str!='u'){
                answer += str;
            }
        }
        return answer;
    }
}