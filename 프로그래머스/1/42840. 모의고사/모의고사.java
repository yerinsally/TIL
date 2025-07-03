import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //수포자 배열
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        //맞춘 개수 배열
        int[] num = new int[3];
        for(int i=0; i<answers.length; i++){
            //정답 배열 > one,two,three이면, 다시 one,two,three 처음부터 순회!
            //정답의 인덱스(i) % 수포자 배열 길이 = 수포자 배열에 순회하는 인덱스
            if(answers[i]==one[i%one.length]){      
                num[0]++;   //one이 맞춘 개수 증가
            }
            if(answers[i]==two[i%two.length]){
                num[1]++;   //two가 맞춘 개수 증가
            }
            if(answers[i]==three[i%three.length]){
                num[2]++;   //three가 맞춘 개수 증가
            }
        }
        //max = 최대값
        int max = -1;
        for(int i=0; i<3; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            if (num[i] == max) {
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}