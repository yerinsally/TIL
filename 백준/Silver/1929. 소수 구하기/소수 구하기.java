import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // M부터 N까지 각 수에 대해 소수 여부를 판별
        for (int num=M; num<=N; num++) {
            if (num == 1) {
                continue; // 1은 소수가 아님
            }

            boolean isPrime = true;
            // 2부터 sqrt(num)까지 확인
            for (int i=2; i*i<=num; i++) {
                if (num%i==0) {
                    isPrime = false; // 소수가 아님
                    break;
                }
            }
            // 소수인 경우 출력
            if (isPrime) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
