import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] cha = str.toCharArray();
		Arrays.sort(cha);
		
		for(int i = cha.length-1; i >= 0; i--) {
			System.out.print(cha[i]);
		}
	}
}