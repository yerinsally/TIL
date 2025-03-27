import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //1. 큐(선입선출)에 각각 개발 일수 넣기
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            if((100-progresses[i])%speeds[i]==0){
                q.add((100-progresses[i])/speeds[i]);
            }else{
                q.add((100-progresses[i])/speeds[i]+1);
            }
        }
        //2. 조건에 따라 큐 poll
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            //answer에 넣을 횟수 초기화(처음에 무조건 poll하니까 1로)
            int cnt = 1;
            //선입선출대로 조건에 따라 개발일수 저장
            int num = q.poll();
            while(!q.isEmpty() && q.peek() <= num){
                q.poll();
                cnt++;
            }
            //answer에 넣을 횟수 리스트에 저장
            list.add(cnt);
        }
        //3. ArrayList → int[] 변환
        return list.stream().mapToInt(i->i).toArray();
    }
}