import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result[] = new int[10];
		int in[] = new int [10];
		int out[] = new int [10];
		for(int i=0;i<10;i++) {
			out[i] = sc.nextInt(); in[i] = sc.nextInt();
		}
		result[0] = in[0] - out[0];
		for(int i=1;i<10;i++) {
			for(int j=i-1;j<i;j++) {
				result[i] = result[j] + in[i] -out[i];
			}
		}
		Arrays.sort(result);
		System.out.println(result[result.length-1]);
		
	}
}