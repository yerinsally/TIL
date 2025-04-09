import java.util.*;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        //파일의 개수
        String pattern_str = sc.next();  //패턴(ex. a*d)
        
        //정규식의 *는 .*, ?는 .로 변환 필요(ex. a*d -> a.*d)
        String regex = pattern_str.replace("*",".*");
        // Pattern 객체로 컴파일된 정규식은 뒤의 Matcher 클래스에서 사용됨
        Pattern pattern = Pattern.compile(regex);

        for(int i=0; i<n; i++){
            String file = sc.next();
            if(pattern.matcher(file).matches()){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }
        }
    }
}