import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<names.length; i++){
            if(i%5==0){
                list.add(names[i]);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}