class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = 0;
        for(int i=0; i<num; i++){
            if(num%2==1){
                mid = total/num;
                answer[i] = mid - (num-1)/2 + i;
            }else{
                //(쌍의 개수)(2n+1)=total이 되는 n 구하기
                mid = (total/(num/2)-1)/2;
                answer[i] = mid - (num/2-1) + i;
            }
        }
        return answer;
    }
}