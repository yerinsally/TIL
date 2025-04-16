import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        //바구니에 최소 담을 수 있는 합 = N의 기준
        int min_sum = K*(K+1)/2;
        if(N < min_sum){
            System.out.println(-1);
        }else if((N-K*(K+1)/2)%K == 0){
            //최소로 담을 수 있는 공 다 담고, 남은 공이 (K의 배수)이면
            System.out.println(K-1);
        }else{
            System.out.println(K);
        }
    }
}