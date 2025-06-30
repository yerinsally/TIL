import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<i; j++){
                if(max < numbers[i]*numbers[j]){
                    max = numbers[i]*numbers[j];
                }
            }
        }
        return max;
    }
}