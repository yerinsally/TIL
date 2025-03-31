class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //1. 해시맵 key-value 쌍
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n, hm.getOrDefault(n,0)+1);
        }

        //2. value 값 기준으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(hm.keySet());
        keySet.sort((o1,o2) -> hm.get(o2)-hm.get(o1));

        //3. 정답 리스트 구현
        List<Integer> answer = new ArrayList<>();
        int num = 0;
        for(int key : keySet){
            num++;
            if(num > k){
                break;
            }
            answer.add(key);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}