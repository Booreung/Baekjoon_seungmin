import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int result = 0;
		int cnt = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
			if(cnt == num2) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}