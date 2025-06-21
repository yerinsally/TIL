class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char let = letter.charAt(0);
        for(char str : my_string.toCharArray()){
            if(str != let){
                answer += Character.toString(str);
            }
        }
        return answer;
    }
}