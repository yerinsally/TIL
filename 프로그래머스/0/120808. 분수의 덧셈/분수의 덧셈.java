class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //ex. 10, 24 의 최대공약수
        //10%24 = 10 -> 24%10 = 4 -> 10%4 = 2 -> 4%2 = 0
        //최대 공약수 = 2, 최소 공배수 = (10✕24)/2 = 120
        
        //denom1과 denom2의 최소공배수
        int a = denom1;
        int b = denom2;
        while(true){
            int num = a%b;
            if(num != 0){
                a = b;
                b = num;
            }else{
                break;
            }
        }
        //최소공배수(LCM), 최대공약수(GCD, =b)
        int lcm = (denom1*denom2)/b;
        
        //기약 분수로 나타내기 : 분자, 분모를 최대공약수로 나누기
        int first = (lcm/denom1)*numer1 + (lcm/denom2)*numer2;
        int second = lcm;
        while(true){
            int num = first%second;
            if(num != 0){
                first = second;
                second = num;
            }else{
                break;
            }
        }
        int[] answer = new int[2];
        answer[0] = ((lcm/denom1)*numer1 + (lcm/denom2)*numer2)/second;
        answer[1] = lcm/second;
        return answer;
    }
}