import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] s_list = Arrays.stream(s.split(" "))
                         .mapToInt(Integer::parseInt)
                        .toArray();
        Arrays.sort(s_list);
        
        answer = s_list[0] + " " +s_list[s_list.length - 1];
        return answer;
    }
}