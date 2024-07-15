class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;                 //무조건 덧칠 한번 시작
        int start = section[0];         //시작 지점
        for(int i=1; i<section.length; i++){
            if(section[i] > start+m-1){     //덧칠한 마지막 인덱스보다 크면 칠하기
                answer++;
                start = section[i];     //시작 지점을 해당 인덱스로 재설정
            }
        }
        return answer;
    }
}