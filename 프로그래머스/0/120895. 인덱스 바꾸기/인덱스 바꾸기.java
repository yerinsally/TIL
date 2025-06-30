class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i=0; i<my_string.length(); i++){
            if(i==num1){
                answer += arr[num2];
            }else if(i==num2){
                answer += arr[num1];
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}