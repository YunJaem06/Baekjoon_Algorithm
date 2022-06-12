import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i = 1; i <= a; i++)
			que.add(i);
		while(que.size() > 1) {
			System.out.print(que.poll() + " ");
			que.add(que.poll());
		}
		System.out.print(que.poll());
	}
}