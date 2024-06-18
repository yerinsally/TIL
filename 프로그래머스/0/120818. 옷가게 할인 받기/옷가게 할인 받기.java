class Solution {
    public int solution(int price) {
        int answer = 0;
        double discount = 0;
        if(price >= 100000 && price < 300000) {
            discount = 0.05;
        }else if(price >= 300000 && price < 500000) {
            discount = 0.1;
        }else if(price >= 500000) {
            discount = 0.2;
        }
        answer = (int)(price * (1-discount));
        return answer;
    }
}