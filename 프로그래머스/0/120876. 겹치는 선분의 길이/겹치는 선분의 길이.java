class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201]; //선분이 지나는 모든 구간 마킹, 길이(0~200)
        for(int i=0; i<3; i++){
            int x1 = lines[i][0]+100;   //최소 0부터이므로
            int y1 = lines[i][1]+100;
            for(int j=x1; j<y1; j++){
                count[j]++; //선분이 지나면 0부터 증가
            }
        }
        //선분이 2개 이상 겹치면 됨 : 중복 없이 카운트 O
        int answer = 0;
        for(int i=0; i<count.length; i++){
            if(count[i]>=2){
                answer++;
            }
        }
        return answer;
    }
}