import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int num = a;
		
		for (int i = 0; i < a; i++) {
		String str = sc.next();
		boolean check[] = new boolean[26]; 
		
		for (int j = 1; j < str.length(); j++) { 
			if(str.charAt(j) != str.charAt(j-1)) {
				if(check[str.charAt(j)-97] == true) {
					num--;
					break;
				}
				check[str.charAt(j-1) - 97] = true;
				}
			}
		}
		System.out.println(num);
	}
}