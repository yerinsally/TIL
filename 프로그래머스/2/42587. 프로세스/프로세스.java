import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        //priorities : 프로세스의 중요도
        //location : 해당 인덱스의 프로세스가 몇번째로 실행되는지
        
        //1. 인덱스를 저장하는 큐
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            q.add(i);
        }
        
        //2. 우선순위 큐 (내림차순 정렬)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int pr : priorities){
            pq.add(pr);
        }
        
        //3. 프로세스 실행 순서 확인
        while(!q.isEmpty()){
            int index = q.poll();   //현재 프로세스의 인덱스
            if(priorities[index] < pq.peek()){ //현재 프로세스보다 높은 우선순위 존재
                q.add(index);
            }else{
                answer++;   //실행 순서 증가
                pq.poll();  //실행된 프로세스 우선순위 제거
                if(index==location){  //찾는 프로세스면 종료
                    break;
                }
            }

        }
        return answer;
    }
}