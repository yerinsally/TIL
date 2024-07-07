class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; // 연속 성공 시간
        int x = bandage[1]; // 1초당 회복량
        int y = bandage[2]; // 연속 성공 시 추가 회복량

        int now = health; // 현재 체력
        int con = 0; // 연속 성공 여부
        int attackIndex = 0; // 현재 공격을 추적하는 인덱스

        // 최대 시간은 가장 마지막 공격 시간까지 고려
        int totalTime = attacks[attacks.length - 1][0];

        for (int i = 1; i <= totalTime; i++) {
            // 현재 시간이 공격 시간인지 확인
            if (attackIndex < attacks.length && attacks[attackIndex][0] == i) {
                // 공격을 받으면 기술이 취소되고 피해를 입음
                con = 0;
                now -= attacks[attackIndex][1];
                attackIndex++;
            } else {
                // 공격이 없으면 체력을 회복
                con++;
                now += x;
                // 연속 성공 시간 도달 시 추가 회복
                if (con == t) {
                    now += y;
                    con = 0; // 연속 성공 시간 초기화
                }
            }

            // 체력이 최대 체력을 초과하지 않도록 함
            if (now > health) {
                now = health;
            }

            // 체력이 0 이하가 되면 캐릭터가 죽음
            if (now <= 0) {
                return -1;
            }
        }

        return now;
    }
}
