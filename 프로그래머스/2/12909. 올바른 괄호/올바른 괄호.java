import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[0]==')'){
                return false;
            }else if(arr[i]=='('){
                stack.push(')');
            }else if(!stack.isEmpty() && stack.peek()==arr[i]){
                stack.pop();
            }
        }
        return stack.isEmpty(); 
    }
}