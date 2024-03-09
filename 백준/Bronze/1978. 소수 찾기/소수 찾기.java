import java.util.*;

public class Main {

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int ary[] = new int[size];
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			ary[i] = sc.nextInt();
		}

		for (int i = 0; i < ary.length; i++) {
			if (isPrime(ary[i])) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}