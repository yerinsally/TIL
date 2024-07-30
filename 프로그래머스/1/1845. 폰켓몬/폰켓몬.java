import java.util.*;
class Solution {
    public int solution(int[] nums) {
        //개수는 중요하지 않고, 종류의 수가 중요
        //조건 : n/2와 종류의 수(=최대한 많은 종류를 가져와야함) 중 작은 수가 정답
        int answer = 0;
        //중복 제거 자료구조 Set : 종류의 개수가 저장됨
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        //n/2마리 : 최대 담을 수 있는 폰켓몬 마리
        int number = nums.length/2;
        //set.size()와 n/2 비교
        if(set.size() >= number){
            answer = number;
        }else{
            answer = set.size();
        }
        return answer;
    }
}