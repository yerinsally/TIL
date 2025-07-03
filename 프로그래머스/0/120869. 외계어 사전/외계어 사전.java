import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        //정렬한 spell의 단어 & 정렬한 dic[i]의 단어가 같으면 됨 !!
        
        //1. spell을 하나의 문자열로 합친 후 정렬 : String.join
        char[] spell_char = String.join("",spell).toCharArray();
        Arrays.sort(spell_char);
        String spell2 = new String(spell_char);
        
        //2. dic의 각 단어를 정렬해서 spell과 비교
        for(String word : dic){
            //현재 검사 중인 word의 길이가 spell과 다르면 다음 word 반복문으로 넘어가야 됨 !!
            if(word.length() != spell.length) continue;
            
            char[] word_char = word.toCharArray();
            Arrays.sort(word_char);
            String word2 = new String(word_char);
            
            if(spell2.equals(word2)){
                return 1;
            }
        }
        return 2;
    }
}