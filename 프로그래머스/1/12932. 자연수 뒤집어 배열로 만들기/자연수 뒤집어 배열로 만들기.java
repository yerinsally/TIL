class Solution {
    public int[] solution(long n) {
        //12345 % 10 = 5, 1234 % 10 = 4, 123 % 10 = 3, 12 % 10 = 2, 1 % 10 = 1
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        for(int i=0; i<s.length(); i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}