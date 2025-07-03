class Solution {
    public int solution(String s) {
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0; i<number.length; i++){
            if(s.contains(number[i])){
                s = s.replace(number[i], String.valueOf(i));
            }
        }
        //문자열 -> int : Integer.parseInt()
        return Integer.parseInt(s);
    }
}