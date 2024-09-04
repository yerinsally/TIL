class Solution {
    public int[] solution(int n, String[] words) {
        //words 돌아가면서 탈락자가 나올때 도출
        int[] answer = new int[2];
        //중복되는 경우 X
        int person = 0;
        int number = 0;
        for(int i=1; i<words.length; i++){
            Character first = words[i].toCharArray()[0];
            person = (i%n)+1;     //1,2,3... 순서
            number = (i/n)+1;     //n번 사람 중 몇번 차례인지
            //Character last = words[i-1].toCharArray()[words[i].length()-1];
            Character last = words[i-1].charAt(words[i-1].length()-1);
            if(last != first){
                answer[0] = person;
                answer[1] = number;
                return answer;
            }
            for(int j=0; j<i; j++){
                if(words[i].equals(words[j])){
                    answer[0] = person;
                    answer[1] = number;
                    return answer;
                }else{
                    answer[0] = 0;
                    answer[1] = 0;
                }
            }
        }
        return answer;
    }
}