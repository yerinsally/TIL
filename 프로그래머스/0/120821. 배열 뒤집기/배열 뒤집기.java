class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];    //배열의 길이 먼저 지정!
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[num_list.length - i -1];
        }
        return answer;
    }
}