import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        //배열 X, 리스트에 담기(add)
        //리스트 → 배열 : list.stream().mapToInt(i -> i).toArray()
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                list.add(numlist[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}