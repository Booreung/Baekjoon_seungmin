import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int t = sc.nextInt();
		int tmp ;
		
		tmp = t + M;
		
		if(tmp>=60) {
			H = H + (tmp/60);
			M = tmp%60;
		}
		else {
			M = M + t;
		}
		if (H>=24) H = H - 24;
		
		System.out.printf("%d %d",H,M);
	}
}