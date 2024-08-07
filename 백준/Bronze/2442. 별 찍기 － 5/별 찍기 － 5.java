import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i=1; i<=n; i++) {
			for(int j=n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			if(i != n) {
				System.out.println();
			}
		}
	}
}