class Solution {
    public int solution(int[] box, int n) {
        //box = [가로, 세로, 높이]
        //각 몫을 int형으로 강제 변환한 후 곱하기!
        return (int)(box[0]/n) * (int)(box[1]/n) * (int)(box[2]/n);
    }
}