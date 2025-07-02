class Solution {
    public int solution(String myString, String pat) {
        //두 문자 모두 소문자로 변환
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        //문자열 포함여부
        if(myString.contains(pat)){
            return 1;
        }
        return 0;
    }
}