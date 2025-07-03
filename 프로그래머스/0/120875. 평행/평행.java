class Solution {
    public int solution(int[][] dots) {
        //총 3가지 선분쌍 조합만 판단
        if(isParallel(dots[0],dots[1],dots[2],dots[3])) return 1;
        if(isParallel(dots[0],dots[2],dots[1],dots[3])) return 1;
        if(isParallel(dots[0],dots[3],dots[2],dots[1])) return 1;
        return 0;
    }
    //두 선분 (a,b)와 (c,d)가 평행한지 판단
    static boolean isParallel(int[] a,int[] b,int[] c,int[] d){
        int x1 = a[0]-b[0];
        int x2 = c[0]-d[0];
        int y1 = a[1]-b[1];
        int y2 = c[1]-d[1];
        //기울기 비교는 실수보다 분수 곱셈 비교로 처리
        //y1/x1 == y2/x2
        //곱셈 방식으로 비교 : (x2-x1)*(y4-y3)==(x4-x3)*(y2-y1)
        return x1*y2 == x2*y1;
    }
}