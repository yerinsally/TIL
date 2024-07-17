class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //행렬의 곱 : arr1의 열의 길이 = arr2의 행의 길이
        int row = arr1.length;          //arr1의 행의 길이 = 3
        int col = arr2[0].length;       //arr2의 열의 길이 = 2
        int arr2_len = arr2.length;     //arr2의 행의 길이 = 2
        
        //행렬 곱셈의 결과 : [arr1의 행 길이][arr2의 열 길이]
        int[][] answer = new int[row][col];
        for(int i=0 ; i<row ; i++) {
			for(int j=0 ; j<col ; j++) {
				for(int k=0 ; k<arr2_len ; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
        return answer;
    }
}