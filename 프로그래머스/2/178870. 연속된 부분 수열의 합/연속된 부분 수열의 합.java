class Solution {
    public int[] solution(int[] sequence, int k) {
        //투 포인터 방식
        int left = 0, right = 0, sum = sequence[0];
        int[] answer = {-1,-1};
        int min = Integer.MAX_VALUE;
        
        while(right<sequence.length){
            if(sum == k){
                //현재 구간이 더 짧거나, 같은 길이면 더 앞쪽 구간 갱신
                if(right-left < min || (right-left==min && left<answer[0])){
                    min = right-left;
                    answer[0] = left;
                    answer[1] = right;
                }
            }
            //sum이 k 이상이면 left 이동
            if(sum >= k){
                sum -= sequence[left];
                left++;
            }
            //sum이 k보다 작으면 right 이동
            else{
                right++;
                if(right < sequence.length){
                    sum += sequence[right];
                }
            }
        }
        return answer;
    }
}