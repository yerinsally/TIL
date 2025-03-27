import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);     //오름차순 정렬
        for(int i=0; i<citations.length; i++) {
            int h = citations.length-i;     //현재 논문이 h번 이상 인용된 개수
            if (citations[i]>=h){           //h-index 조건 만족하면 바로 리턴
                return h;
            }
        }
        return 0;   //h-index를 만족하는 값이 없다면 0 반환
    }
}