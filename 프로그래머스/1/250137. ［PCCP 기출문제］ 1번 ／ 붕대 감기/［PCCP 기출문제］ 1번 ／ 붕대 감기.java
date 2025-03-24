class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //t = 연속 성공 시간, x = 1초당 회복량, y = 연속 성공 시 추가 회복량
        //health = 초기 상태 체력
        //attacks = [공격 시간, 피해량] 2차원 배열
        int t = bandage[0], x = bandage[1], y = bandage[2];
        int now = health;   //now = 초기 상태, health = 최대 체력
        int success = 0;    //연속 성공 횟수
        int attack = 0;     //공격할 인덱스인지 확인(2차원 배열 순차 접근)
        
        for(int i=1; i<=attacks[attacks.length-1][0]; i++){
            //공격할 인덱스인지 확인, 맞으면 연속 성공 초기화
            if(i==attacks[attack][0]){
                now -= attacks[attack][1];
                success = 0;
                attack++;
            }else{
                now += x;
                success++;
                if(success==t){ //연속 성공 시 추가 회복량
                    now += y;
                    success = 0;
                }
            }
            if(now > health){   //최대 체력 초과인 경우
                now = health;
            }
            if(now <= 0){       //현재 체력이 0 이하인 경우
                return -1;
            }
        }
        return now;
    }
}