import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //f(n)값을 저장할 배열 (1~116)
        long[] fibonacci = new long[117]; 
        fibonacci[1]=1;    //f(1)=1
        fibonacci[2]=1;    //f(2)=1
        fibonacci[3]=1;    //f(3)=1
        
        //피보나치 수열 생성
        for(int i=4; i<=n; i++){
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-3];
        }
        
        //n번째 값 출력
        System.out.println(fibonacci[n]);
        sc.close();
    }
    
}