//입력 : N,M 첫번째 줄, 다음 줄부터 NxM 배열
//왼쪽, 오른쪽 아래로 이동 가능하며 한번 방문한 위치는 다시 방문하지 않음
//좌->우로 보내고, 우->좌로 다시 보내서 각 위치에 도달할 때의 최댓값을 DP 테이블에 업데이트

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[][] dp = new int[N][M];
        dp[0][0] = map[0][0];
        for(int j=1; j<M; j++){
            dp[0][j] = map[0][j] + dp[0][j-1];
        }
        for(int i=1; i<N; i++){
            //왼쪽 -> 오른쪽
            int[] leftToRight = new int[M];
            leftToRight[0] = dp[i-1][0] + map[i][0];
            for(int j=1; j<M; j++){
                leftToRight[j] = Math.max(leftToRight[j-1], dp[i-1][j])+map[i][j];
            }
            
            //오른쪽 -> 왼쪽 
            int[] rightToLeft = new int[M];
            rightToLeft[M-1] = dp[i-1][M-1] + map[i][M-1];
            for(int j=M-2; j>=0; j--){
                rightToLeft[j] = Math.max(rightToLeft[j+1], dp[i-1][j])+map[i][j];
            }
            
            for(int j=0; j<M; j++){
                dp[i][j] = Math.max(leftToRight[j], rightToLeft[j]);
            }
        }
        System.out.println(dp[N-1][M-1]);
    }
}