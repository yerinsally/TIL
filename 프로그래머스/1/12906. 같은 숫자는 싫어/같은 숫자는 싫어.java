import java.util.*;
public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            //연속으로 나타나는 수 : 스택이 비어있지 않고, 스택의 상단 값과 넣을 값이 같다면
            if(!stack.isEmpty() && stack.peek()==arr[i]){
                continue;
            }else{
                stack.push(arr[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}