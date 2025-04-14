import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int max_len = 0;
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            max_len = Math.max(max_len, arr[i]);
        }
        
        int left = 1;
        int right = max_len;
        int answer = 0;
        while(left <= right){
            int mid = (left+right)/2;
            long count = 0;
            for(int a : arr){
                count += a/mid;
            }
            if(count >= M){
                answer = mid;    //더 길게 나눠줄 수 있으니까 저장
                left = mid+1;    //더 긴 길이로 시도
            }else{
                right = mid-1;   //너무 길어서 조카 수 못 맞추면 길이 줄이기
            }
        }
        System.out.println(answer);
    }
}