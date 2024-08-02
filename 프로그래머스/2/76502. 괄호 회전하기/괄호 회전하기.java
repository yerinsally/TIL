import java.util.*;
class Solution {
    public int solution(String s) {
        int count = 0;
        
        for(int i=0; i<s.length(); i++){
            String ss = s.substring(i)+s.substring(0,i);
            Stack<Character> stack = new Stack<>();
            boolean valid = true;
            
            for(int j=0; j<ss.length(); j++){
                char ch = ss.charAt(j);
                if(ch=='(') stack.push(')');
                else if(ch=='{') stack.push('}');
                else if(ch=='[') stack.push(']');
                else{
                    if(stack.isEmpty() || stack.pop()!=ch) {
                        valid = false;
                        break;
                    }
                }
            }
            if(valid && stack.isEmpty()) count++;
        }
        return count;
    }
}