import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        int count = 0;
        String temp = "";
        for(String b : babbling){
            for(String a : arr){
                if(b.contains(a)){
                    b = b.replace(a, "1");
                    temp += "1";
                }
            }
            if(b.equals(temp)){
                count++;
            }
            temp = "";            
        }
        return count;
    }
}