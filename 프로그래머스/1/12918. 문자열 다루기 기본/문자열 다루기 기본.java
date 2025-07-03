class Solution {
    public boolean solution(String s) {
        int number = 0;
        if(s.length()==4 || s.length()==6){
            for(char str : s.toCharArray()){
                if(Character.isDigit(str)){
                   number++;;
                }
            }
            if(s.length()==number){
                return true;
            }
        }
        return false;
    }
}