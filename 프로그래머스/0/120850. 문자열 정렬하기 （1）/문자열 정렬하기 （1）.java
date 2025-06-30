import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        for(char str : my_string.toCharArray()){
            if(Character.isDigit(str)){
                list.add(Character.getNumericValue(str)); //str-'0'
            }
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}