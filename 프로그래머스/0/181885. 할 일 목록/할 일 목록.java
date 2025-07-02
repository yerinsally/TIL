import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        //String 리스트 → String 배열
        //String[] arr2 = arrList.stream().toArray(String[]::new);
        return list.stream().toArray(String[]::new);
    }
}