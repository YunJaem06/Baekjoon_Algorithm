import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[10];
		
		int count = 0;
		
		for(int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt() % 42;
		}
		for(int i = 0; i < n.length; i++) {
			int cnt = 0;
			for(int j = i+1; j <n.length; j++) {
				if(n[i] == n[j]) {
					cnt++;
				}
			}
			if(cnt == 0) {
				count++;
			}
		}
		System.out.println(count);	
	}	
}