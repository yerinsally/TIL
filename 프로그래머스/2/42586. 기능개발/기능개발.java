import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        //큐 : 선입선출
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<progresses.length; i++){
            int left = 100-progresses[i];
            int a = left/speeds[i];
            if(left%speeds[i] == 0){
                queue.add(a);
            } else {
                queue.add(a+1);
            }
        }
        //System.out.print(queue);
        while(!queue.isEmpty()){
            int current = queue.poll();
            int cnt = 1;
            while(!queue.isEmpty() && queue.peek() <= current){
                queue.poll();
                cnt++;
            }
            list.add(cnt);
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
         return answer;
     }
 }