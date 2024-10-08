class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(char a : arr){
            if(Character.isUpperCase(a)){
                answer += Character.toLowerCase(a);
            }else{
                answer += Character.toUpperCase(a);
            }
        }
        return answer;
    }
}