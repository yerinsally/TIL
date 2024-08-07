import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		Stack<Integer> stack = new Stack<>();
		int answer = 0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(scanner.nextLine());
			if(num != 0) {
				stack.push(num);
			}else if(num == 0){
				stack.pop();
			}
		}
		while(!stack.isEmpty()) {
			answer += stack.peek();
			stack.pop();
		}
		System.out.print(answer);
	}
}