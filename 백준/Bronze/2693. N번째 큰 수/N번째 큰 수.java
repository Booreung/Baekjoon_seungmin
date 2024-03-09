import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int result[] = new int[size];
		
		for(int i = 0;i<size;i++) {
			int ary[] = new int[10];
			for(int j = 0;j<10;j++) {
				ary[j] = sc.nextInt();
			}
			Arrays.sort(ary);
			result[i] = ary[7];
		}
		for(int k : result) System.out.println(k);
	}
}