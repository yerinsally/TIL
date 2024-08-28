import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        String binary = Integer.toBinaryString(n);
        //int number = Integer.parseInt(binary);
        for(char num : binary.toCharArray()){
            ans += Character.getNumericValue(num);
        }
        return ans;
    }
}