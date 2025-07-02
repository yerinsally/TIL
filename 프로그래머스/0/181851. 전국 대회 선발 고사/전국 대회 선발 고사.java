class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] abc = new int[3];
        int index = 0;
        int num = 1;    //rank와 비교할 숫자, 1등부터 시작
        while(true){
            for(int i=0; i<rank.length; i++){
                if(num==rank[i] && attendance[i]){
                    abc[index++] = i;
                }
            }
            num++;
            if(index==3){
                break;
            }
        }
        return 10000*abc[0]+100*abc[1]+abc[2];
    }
}