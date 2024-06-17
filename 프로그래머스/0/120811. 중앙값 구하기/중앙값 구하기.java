import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int num = (array.length-1)/2;
        int answer = array[num];
        return answer;
    }
}