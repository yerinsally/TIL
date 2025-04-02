class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        //바탕화면 정리 시뮬레이션
        //직사각형의 세로 : 최신/마지막 배열의 파일(가장 상단/하단)
        //직사각형의 가로 : 배열 중 가장 먼저/늦게 나타나는 파일(가장 왼쪽/오른쪽)
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    top = Math.min(top,i);
                    left = Math.min(left,j);
                    bottom = Math.max(bottom,i);
                    right = Math.max(right,j);
                }
            }
        }
        if(top == Integer.MAX_VALUE){
                return new int[]{0,0,0,0};
        }
        answer[0] = top;
        answer[1] = left;
        answer[2] = bottom+1;
        answer[3] = right+1;
        return answer;
    }
}