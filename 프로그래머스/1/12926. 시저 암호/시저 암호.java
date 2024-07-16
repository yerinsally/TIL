class Solution {
    public String solution(String s, int n) {
        //char : 알파벳 대문자 65~90, 알파벳 소문자 97~122
        String answer = "";
        char[] arr = s.toCharArray();
        int new_s = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==' '){
                answer += ' ';
            }else{
                if(arr[i]=='z'){
                    arr[i] = 'a'-1;
                    new_s = (int)(arr[i]+n);
                }else if(arr[i]=='Z'){
                    arr[i] = 'A'-1;
                    new_s = (int)(arr[i]+n);
                }
                //arr[i]=65~90이면 arr[i]+n / arr[i]+n>90이면 arr[i]+n-26
                //arr[i]=97~122이면 arr[i]+n / arr[i]+n>122이면 arr[i]+n-26
                if(arr[i]>=65 && arr[i]<=90 && arr[i]+n<=90){
                    new_s = (int)(arr[i]+n);
                }else if(arr[i]>=65 && arr[i]<=90 && arr[i]+n>90){
                    new_s = (int)(arr[i]+n-26);
                }else if(arr[i]>=97 && arr[i]<=122 && arr[i]+n<=122){
                    new_s = (int)(arr[i]+n);
                }else if(arr[i]>=97 && arr[i]<=122 && arr[i]+n>122){
                    new_s = (int)(arr[i]+n-26);
                }
                answer += (char)new_s;
            }
        }
        return answer;
    }
}