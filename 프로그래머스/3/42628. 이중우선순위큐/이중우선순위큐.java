import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        //우선순위 큐 : 오름차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(String o : operations){
            if(o.startsWith("I")){
                //문자열 -> 정수로 변환
                int num = Integer.parseInt(o.substring(2));
                pq.add(num);
            }else if(!pq.isEmpty() && o.equals("D -1")){
                pq.poll();     //오름차순 우선순위 큐에서 제거
            }else if(!pq.isEmpty() && o.equals("D 1")){
                List<Integer> list = new ArrayList<>(pq);
                int max = Collections.max(list);    // 최댓값 찾기
                pq.remove(max);
            }
        }
        //System.out.println(pq);
        int[] answer = new int[2];
        if(pq.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            //최댓값 추출
            List<Integer> list = new ArrayList<>(pq);
            int max = Collections.max(list);
            answer[0] = max;
            //최솟값 추출
            answer[1] = pq.peek();
        }
        return answer;
    }
}