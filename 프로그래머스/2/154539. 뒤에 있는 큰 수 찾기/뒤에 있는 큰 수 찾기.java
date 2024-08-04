import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=numbers.length-1; i>=0; i--){
            while(!stack.isEmpty() && numbers[i] >= stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                answer[i] = stack.peek();
            }else{
                answer[i] = -1;
            }
            stack.push(numbers[i]);
        }
        return answer;
    }
}