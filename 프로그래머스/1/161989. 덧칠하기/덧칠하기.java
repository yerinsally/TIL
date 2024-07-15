class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        //1(칠한 구역)로 구성된 n 배열 생성
        int[] wall = new int[n];
        for(int i=0; i<n; i++){
            wall[i] = 1;
        }
        //section 인덱스는 0(칠해야 되는 구역)으로 변환
        for(int j : section){
            wall[j-1] = 0;
        }
        //m만큼 1로 변환, 순회하면서 0일 경우 확인하기
        
        for(int k=0; k<section.length; k++){
            int where = section[k]-1;
            if(wall[where]==0){
                for(int p = where; p < where + m && p < n; p++){
                    wall[p] = 1;
                }
                answer++;
            }
        }
        return answer;
    }
}