import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        // 2. 인접한 전화번호끼리 비교합니다.
        for (int i = 0; i < phone_book.length - 1; i++) {
            // 3. 현재 번호가 다음 번호의 접두사인지 확인합니다.
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // 접두사가 발견되면 false 반환
            }
        }
        return true;
    }
}