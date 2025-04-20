//싸움 시간 N초, B 시전 시간 M초
import java.util.*;
public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(count(N,M));
    }
    
    public static int count(int N, int M){
        int[] dp = new int[N+1];
        dp[0] = 1;    //아무것도 안하기 = 0초
        for(int i=1; i<=N; i++){
            dp[i] = dp[i-1];    //마지막에 A(1초) 쓴 경우
            if(i>=M){
                dp[i] = (dp[i]+dp[i-M]) % MOD;    //마지막에 B(M초) 쓴 경우
            }
        }
        return dp[N];
    }
}