import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //문자열을 배열로 변환
        char[] arr = str.toCharArray();
        
        //Stack : 닫힌 괄호일때 count
        //레이저일때랑 닫힌 괄호일때랑 다른데 어떻게 구분하지..
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='('){
                stack.push('(');
            }else if(i!=0 && arr[i-1]=='(' && arr[i]==')'){
                stack.pop();    //레이저 : 대칭되는 괄호 제거
                count += stack.size();
            }else if(arr[i]==')'){
                stack.pop();    //닫는 괄호의 짝 여는 괄호 제거
                count++;
            }
        }
        System.out.println(count);
    }
}