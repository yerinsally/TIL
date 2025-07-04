class Solution {
    public String solution(int n) {
        String[] str = {"수","박"};
        String answer = "";
        for(int i=0; i<n; i++){
            if(i%2==0){
                answer += str[0];
            }else{
                answer += str[1];
            }
        }
        return answer;
    }
}