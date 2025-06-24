import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]*2);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}