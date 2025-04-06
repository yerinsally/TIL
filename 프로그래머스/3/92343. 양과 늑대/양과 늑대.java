//DFS 깊이 우선 탐색 : 모든 경우의 수를 돌면서 양의 최대 수 구하기
import java.util.*;
class Solution {
    static int sheep_max = 0;
    public int solution(int[] info, int[][] edges) {
        //1. 인접 리스트로 그래프 만들기
        List<Integer>[] graph = new ArrayList[info.length];
        for(int i=0; i<info.length; i++){
            //노드 수만큼 인접 리스트 초기화
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            //간선 정보 넣기
            graph[edge[0]].add(edge[1]);
        }
        
        //2. 시작 노드는 항상 양
        //available = 현재 갈 수 있는 노드들 목록
        List<Integer> available = new ArrayList<>();
        available.add(0);
        
        //3. DFS 호출
        //현재 양 1마리, 늑대 0마리, 현재 위치 0번 노드
        //방문 가능한 노드 목록, 트리 정보 전달
        dfs(1, 0, 0, available, info, graph);
        return sheep_max;
    }
        
    //4. DFS 탐색
    //현재 상태를 기반으로 다음 노드 탐색
    //지금까지 모은 양/늑대 수, 현재 위치한 노드, 다음으로 갈 수 있는 노드들, 노드 정보, 트리 구조
    static void dfs(int sheep,int wolf,int currentNode,
                    List<Integer> available,int[] info,List<Integer>[] graph){
        
        //종료 조건 = 늑대수가 같거나 많아지면 더 이상 진행 불가
        if(wolf >= sheep) return;
        
        //최대값 갱신
        sheep_max = Math.max(sheep_max, sheep);
        
        //다음에 갈 수 있는 노드 목록 갱신
        //현재 위치 제거 + 현재 노드의 자식 노드들을 갈 수 있는 곳에 추가
        List<Integer> nextAvailable = new ArrayList<>(available);
        nextAvailable.remove(Integer.valueOf(currentNode));
        nextAvailable.addAll(graph[currentNode]);
        
        //다음 가능한 노드들에 대해 DFS 재귀 호출
        //지금 갈 수 있는 노드들 중 하나씩 골라서 반복 탐색
        for(int next : nextAvailable){
            int next_sheep = sheep; //양, 늑대 수 복사
            int next_wolf = wolf;
            if(info[next]==0){
                next_sheep++;
            }else{
                next_wolf++;
            }
            //다음 노드로 이동해서 다시 재귀 탐색
            dfs(next_sheep, next_wolf, next, nextAvailable, info, graph);
        }
    }     
}