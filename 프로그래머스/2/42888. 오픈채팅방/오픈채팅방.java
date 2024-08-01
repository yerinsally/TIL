import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        //첫번째 for문 : 최신 name HashMap 사용해서 저장하기
        for(String r : record){
            String action = r.split(" ")[0];
            String uid = r.split(" ")[1];
            if(!action.equals("Leave")){
                String name = r.split(" ")[2];
                map.put(uid, name);
            }
        }
        //두번째 for문 : map을 사용해서 uid의 최신 name 가져오기
        for(String r : record){
            String action = r.split(" ")[0];
            String uid = r.split(" ")[1];
            if(action.equals("Enter")){
                String name = map.get(uid);
                list.add(name+"님이 들어왔습니다.");
            }else if(action.equals("Leave")){
                String name = map.get(uid);
                list.add(name+"님이 나갔습니다.");
                }
            }
        String[] answer = new String[list.size()];
        return list.toArray(answer);
    }
}