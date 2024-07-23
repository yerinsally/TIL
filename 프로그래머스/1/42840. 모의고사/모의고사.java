class Solution {
    public int[] solution(int[] answers) {
        //수포자 배열
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        //맞춘 개수 들어갈 배열
        int[] num = new int[3];
        //맞춘 개수
        for(int i=0; i<answers.length; i++){
            if(answers[i]==one[i%one.length]){      //정답의 인덱스(i) % 배열 길이 = 수포자 배열에 순회하는 인덱스
                num[0]++;   //one이 맞춘 개수 증가
            }
            if(answers[i]==two[i%two.length]){
                num[1]++;   //two가 맞춘 개수 증가
            }
            if(answers[i]==three[i%three.length]){
                num[2]++;   //three가 맞춘 개수 증가
            }
        }
        //어떤 수포자가 가장 많이 맞췄는지
        int max = -1;
        for(int i=0; i<3; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        int count = 0;  //최대값의 개수
        for (int i=0; i<3; i++) {
            if (num[i] == max) {
                count++;
            }
        }
        int[] answer = new int[count];  //최대값의 인덱스를 저장할 배열 생성
        int index = 0;
        for (int i=0; i<3; i++) {
            if (num[i] == max) {
                answer[index++] = i+1;
            }
        }
        return answer;
    }
}