import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		int[] arr = new int[26];
		char ch = '?';
		int max = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 'A';
			arr[num]++;
		}
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max  = arr[i];
				ch = (char)(i + 'A');
			} else if(max == arr[i]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}