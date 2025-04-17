import java.util.*;

public class Main {
    static final int INF = 1000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] space = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                space[i][j] = sc.nextInt();
            }
        }

        int[][][] dp = new int[N][M][3]; // 방향: 0(왼), 1(직진), 2(오른쪽)

        // dp를 INF로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }

        // 첫 줄 초기화
        for (int j = 0; j < M; j++) {
            for (int d = 0; d < 3; d++) {
                dp[0][j][d] = space[0][j];
            }
        }

        // dp 계산
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int d = 0; d < 3; d++) {
                    int prevJ = j - (d - 1); // d=0: j+1, d=1: j, d=2: j-1
                    if (prevJ < 0 || prevJ >= M) continue;

                    for (int prevDir = 0; prevDir < 3; prevDir++) {
                        if (prevDir == d) continue;
                        if (dp[i - 1][prevJ][prevDir] != INF) {
                            dp[i][j][d] = Math.min(dp[i][j][d], dp[i - 1][prevJ][prevDir] + space[i][j]);
                        }
                    }
                }
            }
        }

        // 마지막 줄에서 최소 연료값 찾기
        int result = INF;
        for (int j = 0; j < M; j++) {
            for (int d = 0; d < 3; d++) {
                result = Math.min(result, dp[N - 1][j][d]);
            }
        }

        System.out.println(result);
    }
}
