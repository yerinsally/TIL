class Solution {
    public int solution(int hp) {
        //5,3,1
        return hp/5 + (hp%5)/3 + ((hp%5)%3)/1;
    }
}