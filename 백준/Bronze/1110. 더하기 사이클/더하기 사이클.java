import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int tmp = a;
		int b = 0;
		
		while(true) {
			int left = tmp / 10;
			int right = tmp % 10;
			tmp = right * 10 + (left + right) % 10;
			b++;
			if(a == tmp) {
				break;
			}
		}
		System.out.println(b);
	}	
}