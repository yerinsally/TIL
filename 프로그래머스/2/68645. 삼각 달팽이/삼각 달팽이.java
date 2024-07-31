import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int x=-1, y=0;      //[x][y] 좌표 시작 위치
        int num = 1;        //[x][y]에 저장되는 숫자
        for(int i=0; i<n; i++){
            //3번씩 반복되는 [x][y] 좌표의 변화량
            if(i%3 == 0){
                for(int j=i; j<n; j++){
                    x++;
                    arr[x][y] = num;
                    num++;
                }
            }else if(i%3 == 1){
                for(int j=i; j<n; j++){
                    y++;
                    arr[x][y] = num;
                    num++;
                }
            }else if(i%3 == 2){
                for(int j=i; j<n; j++){
                    x--;
                    y--;
                    arr[x][y] = num;
                    num++; 
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] != 0){
                    list.add(arr[i][j]);
                }
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}