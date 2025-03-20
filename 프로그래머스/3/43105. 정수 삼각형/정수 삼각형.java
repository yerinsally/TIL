class Solution {
    public int solution(int[][] triangle) {
        //마지막 앞 배열의 수 + 마지막 배열의 수 = 최댓값이 되도록
        
        for(int i=triangle.length-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                //해당 배열에 아래층에서 선택 가능한 최대값 저장(+)
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
            }
        }
        //꼭대기에 최대값이 남음
        return triangle[0][0];
    }
}