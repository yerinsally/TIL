import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n = 온도를 측정한 전체 날짜의 수
        //k = 합을 구하기 위한 연속적인 날짜의 수
        int n = sc.nextInt();
        int k = sc.nextInt();
        //배열 = 매일 측정한 온도를 나타내는 n개의 정수
        int[] sequence = new int[n];
        for (int i=0; i<n; i++) {
            sequence[i] = sc.nextInt();
        }
        
        //투 포인터
        int left=0, right=left+k-1;
        int max = Integer.MIN_VALUE;
        while(right<sequence.length){
            int sum = 0;
            for(int i=left; i<=right; i++){
                sum += sequence[i];
            }
            if(sum > max){
               max = sum;
            }
            left++;
            right++;
        }
        System.out.println(max);
        sc.close();
    }
}