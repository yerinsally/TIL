import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //다리를 나타내는 큐(선입선출)
        //시간에 따라 한칸씩 이동 : 트럭 개수만큼 공간(0) 넣기
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<bridge_length; i++){
            q.add(0);
        }
        
        int time = 0;           //총 걸린 시간
        int truck_weight = 0;   //현재 다리 위 트럭 무게
        int index = 0;          //대기 트럭 배열의 인덱스
        
        //매 시간마다 0 pop -> 현재 다리 위 무게에 따라 트럭/0 push
        //다리에 올라갈 트럭 개수, 무게 저장
        while(!q.isEmpty()){
            time++;
            truck_weight -= q.poll();   //poll 후 트럭 무게 제거
            //다음 트럭이 다리 위에 올라갈 수 있는지 확인
            if(index < truck_weights.length){  //배열 인덱스는 트럭 배열 길이 미만
                //현재 다리 무게와 다음 인덱스 트럭의 무게 <= weight
                if(truck_weight + truck_weights[index] <= weight){
                    q.add(truck_weights[index]);
                    truck_weight += truck_weights[index];   //다리 무게 갱신
                    index++;
                }else{
                    //트럭이 못 올라오면 빈 공간 더하기
                    q.add(0);
                }
            }
        }
        return time;
    }
}