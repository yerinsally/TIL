import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        //1. 장르별 총 재생 횟수 저장
        for(int i=0; i<genres.length; i++){
            hm.put(genres[i], hm.getOrDefault(genres[i],0)+plays[i]);
        }
        //2. value 값 기준 내림차순 정렬
        List<String> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1, o2) -> hm.get(o2)-hm.get(o1));
        
        List<Integer> result = new ArrayList<>();
        //3. 각 장르별 최대 2곡 선택
        for(String genre : keySet){
            HashMap<Integer, Integer> hm2 = new HashMap<>();
            for(int j=0; j<genres.length; j++){
                if(genre.equals(genres[j])){
                    hm2.put(j,plays[j]);
                }
            }
            //4. value(재생 횟수) 기준 내림차순, 같으면 key(고유 번호) 기준 오름차순 정렬
            List<Integer> keySet2 = new ArrayList<>(hm2.keySet());
            keySet2.sort((o1, o2) -> {
                if (hm2.get(o1).equals(hm2.get(o2))) {
                    return o1 - o2; // 고유 번호가 작은 것이 우선
                }
                return hm2.get(o2) - hm2.get(o1); // 재생 횟수 내림차순
            });
            //5. 최대 2곡 리스트에 추가
            result.add(keySet2.get(0));
            if(keySet2.size()>1){
                result.add(keySet2.get(1));
            }
        }
        //List를 int 배열로 변환
        return result.stream().mapToInt(i->i).toArray();
    }
}