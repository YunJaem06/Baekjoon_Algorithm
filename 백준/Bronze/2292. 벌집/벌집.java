import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int num = 1;
		int range = 2;
		
		if(a == 1) {
			System.out.println(1);
		} else {
			while(range <= a) {
				range = range + (6 * num);
				num++;
			}
			System.out.println(num);
		}
	}
}