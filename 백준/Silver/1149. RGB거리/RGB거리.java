import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[][] hos = new int[a][3];
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < 3; j++) {
				hos[i][j] = sc.nextInt();
			}
		}
		for(int i = 1; i < a; i++) {
			hos[i][0] += Math.min(hos[i-1][1], hos[i-1][2]);
			hos[i][1] += Math.min(hos[i-1][0], hos[i-1][2]);
			hos[i][2] += Math.min(hos[i-1][0], hos[i-1][1]);
		}
		System.out.println(Math.min(hos[a-1][0],Math.min(hos[a-1][1],hos[a-1][2])));
	}
}