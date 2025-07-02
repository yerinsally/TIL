import java.util.*;
// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
//         for(char str : my_string.toCharArray()){
//             answer += Character.toLowerCase(str);
//         }
//         char[] arr = answer.toCharArray();
//         Arrays.sort(arr);
//         String result = new String(arr);
//         return result;
//     }
// }
class Solution {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
