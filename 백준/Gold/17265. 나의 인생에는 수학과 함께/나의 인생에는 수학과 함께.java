import java.util.*;
public class Main {
    static int N;
    static String[][] map;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    //방향 : 오른쪽, 아래
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();    //숫자 입력 후 줄바꿈 처리
        
        map = new String[N][N];
        for (int i=0; i<N; i++) {
            map[i] = sc.nextLine().split(" ");
        }
        
        //시작 지점에서 DFS 시작
        dfs(0, 0, Integer.parseInt(map[0][0]), "");
        
        System.out.println(max + " " + min);
    }
        
    //DFS 함수
    //value = 
    static void dfs(int x, int y, int value, String operator){
        //끝 지점 도달
        if(x==N-1 && y==N-1){
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        
        for(int d=0; d<2; d++){
            int nx = x+dx[d];
            int ny = y+dy[d];

            if(nx>=0 && nx<N && ny>=0 && ny<N){
                String next = map[nx][ny];
                //다음이 연산자이면
                if(isOperator(next)){
                    dfs(nx, ny, value, next); //연산자 저장
                }else{    //다음이 숫자이면
                    int num = Integer.parseInt(next);
                    int newval = calc(value, num, operator);
                    dfs(nx, ny, newval, ""); //연산자 초기화
                }
            }
        }
    }

    //연산자인지 파악
    static boolean isOperator(String s){
        return s.equals("*") || s.equals("+") || s.equals("-");
    }
    //숫자 계산용
    static int calc(int a, int b, String operator){
        if(operator.equals("*")){
            return a*b;
        }else if(operator.equals("+")){
            return a+b;
        }else{
            return a-b;
        }
    }
}