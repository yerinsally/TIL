import java.util.*;
class Solution {
    public int solution(int n) {
        //실수 & 정수 판별 : 1로 나눈 나머지가 0이면 정수
        if(Math.sqrt(n) % 1 == 0){
            return 1;
        }
        return 2;
    }
}