import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    //행
        int M = sc.nextInt();    //열
        
        //
        int result;
        if(N==1){
            result = 1;
        }else if(N==2){
            //높이가 2일때, 2칸 위/아래로 움직일 수 없음(=이동획수 5번 미만)
            //오른쪽으로 2칸씩 움직이므로 최대 (M+1)/2 또는 4번
            result = Math.min(4, (M+1)/2);            
        }else{
            if(M<7){
                //4가지 이동을 모두 사용하지 못하므로, 최대 1/2/3번
                result = Math.min(4,M);
            }else{
                //4가지 이동 모두 사용 가능
                //(M-2)만큼 이동
                result = M-2;
            }
        }
        System.out.println(result);
    }
}