class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        //홀수 = 전체 - 짝수
        int total = num_list.length;
        int even = 0;
        for(int num : num_list){
            if(num%2==0) even++;
        }
        answer[0] = even;
        answer[1] = total-even;
        return answer;
    }
}