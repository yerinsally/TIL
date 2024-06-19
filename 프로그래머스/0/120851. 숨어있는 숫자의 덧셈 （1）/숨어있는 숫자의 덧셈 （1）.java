class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] array = my_string.toCharArray();
        for(char ch : array) {
            if(Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                answer += num;
            }
        }
        return answer;
    }
}