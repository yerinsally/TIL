import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        //우선순위 큐 = 힙(heap) : 가장 작은 원소부터 우선순위를 가지는 자료구조
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.add(s);
        }
        int answer = 0;
        boolean run = true;
        while(run){
            if(pq.size() == 1 && pq.peek()<K){
                return -1;
            }else{
                if(pq.size() != 1 && pq.peek()<K){
                    answer++;
                    pq.add(pq.poll()+pq.poll()*2);
                }else if(pq.peek() >= K){
                    run = false;
                }
            }
        }
        return answer;
    }
}