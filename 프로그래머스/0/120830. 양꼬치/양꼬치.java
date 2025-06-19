class Solution {
    public int solution(int n, int k) {
        int drink = 0;  //서비스 음료수(-)
        if(n >= 10){
            drink = n/10;
        }
        return n*12000 + k*2000 - drink*2000;
    }
}