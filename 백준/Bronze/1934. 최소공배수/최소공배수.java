import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(b * c/LCM(b,c));
		}
	}
	public static int LCM(int A, int B) {

		while(B != 0) {
			int r = A % B;
			
			A = B;
			B = r;
		}
		return A;
	}
}