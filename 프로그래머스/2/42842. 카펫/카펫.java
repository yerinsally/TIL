class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //전체 카펫 개수
        int carpet = brown + yellow;
        //x,y 약수
        //y는 무조건 3 이상의 자연수
        for(int i=1; i<carpet; i++){
            if(carpet%i == 0){
                //x = i, y = carpet/i
                int y = carpet/i;
                if((i-2)*(y-2) == yellow){
                    answer[0] = i;
                    answer[1] = y;
                }
            }
        }
        return answer;
    }
}