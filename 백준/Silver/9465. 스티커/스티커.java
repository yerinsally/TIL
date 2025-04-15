//로직
//2행 n열 테이블을 만든 후, 왼쪽부터 오른쪽으로 진행하며
//각 위치에 올 수 있는 최댓값들을 넣어주기
//반대되는 행의 앞 두자리(최댓값 갱신)를 비교하며, 현재 위치의 점수와 합쳐서,
//최댓값을 현재 테이블에 업데이트

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        //2행 n열 테이블 생성하기
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[][] score = new int[2][n+1];
            
            for(int i=0; i<2; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=1; j<=n; j++){
                    score[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            //DP 테이블 갱신하기
            int[][] dp = new int[2][n+1];
            dp[0][1] = score[0][1];
            dp[1][1] = score[1][1];
            
            for(int i=2; i<=n; i++){
                //반대되는 행의 최댓값 갱신 후 해당 위치의 score 더하기
                dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + score[0][i];
                dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + score[1][i];
            }
            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}