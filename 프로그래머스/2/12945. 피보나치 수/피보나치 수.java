class Solution {
    public int solution(int n) {
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;     //f0 + f1
        for(int i=1; i<n; i++){
            f2 = (f0+f1) % 1234567;
            f0 = f1;
            f1 = f2;
        }
        return (int)f2;
    }
}