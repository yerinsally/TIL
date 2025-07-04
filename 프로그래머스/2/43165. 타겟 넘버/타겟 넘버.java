//DFS : 깊이 우선 탐색(재귀 함수 이용)
//각 숫자에 대해 +,-를 붙이는 두 가지 경우를 모두 시도
class Solution {
    int count = 0; //target을 만족하는 경우의 수
    public int solution(int[] numbers, int target) {
        //dfs 호출
        //depth 인덱스 0부터 시작, sum 0 초기화
        dfs(numbers, target, 0, 0);
        return count;
    }
    //dfs 함수 정의
    //depth = 현재 탐색 중인 숫자 인덱스, sum = 현재까지의 합계
    private void dfs(int[] numbers, int target, int depth, int sum) {
        //종료조건 : 모든 숫자를 사용한 경우
        if(depth==numbers.length){
            if(sum==target){
                count++; //경우의 수 증가
            }
            return;
        }
        //현재 숫자를 더하는 경우
        dfs(numbers, target, depth+1, sum+numbers[depth]);
        //현재 숫자를 빼는 경우
        dfs(numbers, target, depth+1, sum-numbers[depth]);
    }
}