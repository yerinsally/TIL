class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");     //문자열 -> 리스트 변환
        int x = 1;              //x가 나온 횟수 1부터 시작
        int y = 0;              //x가 아닌 글자들이 나온 횟수
        String x_str = str[0];  //처음 시작은 첫번째 글자
        //문자열이 1개인 바로 1 return
        if(str.length == 1){    
            return 1;
        }
        for(int i=1; i<=str.length-1; i++){
            if(str[i].equals(x_str)){ 
                x++; 
            }else{ 
                y++;
            }
            if(x==y){
                answer++;
                x = 0;      //x 다시 0
                y = 0;      //y 다시 0
                if(i!=str.length-1){
                    x_str = str[i+1];
                }
            }
            //두 횟수가 다른 상태에서 더 이상 읽을 글자 X, 문자열 분리
            if(x!=y && i==str.length-1){
                answer++;
            }
        }
        return answer;
    }
}