import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        //score.length가 k일때까지는 채우기, k까지의 최솟값 동일
        //k > score.length인 경우 방지 : Math.min(k,score.length)
        int min = Integer.MAX_VALUE;
        for(int i=0; i<Math.min(k,score.length); i++){
            list.add(score[i]);
            min = Math.min(min,score[i]);
            answer[i] = min;
        }
        //list 최솟값보다 큰 score[i]이면
        //list 최솟값 제외 & score[i] add
        for(int i=k; i<score.length; i++){
            int min2 = Collections.min(list);
            if(score[i] > min2){
                list.remove(Integer.valueOf(min2));
                list.add(score[i]);
            }
            answer[i] = Collections.min(list);
        }
        return answer;
    }
}