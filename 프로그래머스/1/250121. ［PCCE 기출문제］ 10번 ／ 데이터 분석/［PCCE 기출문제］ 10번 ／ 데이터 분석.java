import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> l = new ArrayList<>();                 //int[]로 구성된 ArrayList 생성
        String[] text = {"code","date","maximum","remain"};     //4가지 문자열에 대해 배열로 만들기
        
        //text 배열 내 일치하는 data[j] l에 더함
        for(int i=0; i<text.length; i++){
            if(ext.equals(text[i])){
                for(int j=0; j<data.length; j++){
                    if(data[j][i] < val_ext){
                        l.add(data[j]);
                    }
                }
            }     
        }
        
        //answer에 배열의 길이를 지정하고 l 인덱스 더함
        int[][] answer = new int[l.size()][4];
        for(int k=0; k<l.size(); k++) {
            answer[k] = l.get(k);
        }
        
        
        //정렬 : 람다식 사용
        if(sort_by.equals(text[0])){
            Arrays.sort(answer, (o1, o2) -> o1[0]-o2[0] );
        }else if(sort_by.equals(text[1])){
            Arrays.sort(answer, (o1, o2) -> o1[1]-o2[1] );
        }else if(sort_by.equals(text[2])){
            Arrays.sort(answer, (o1, o2) -> o1[2]-o2[2] );
        }else if(sort_by.equals(text[3])){
            Arrays.sort(answer, (o1, o2) -> o1[3]-o2[3] );
        }
        return answer;
    }
}