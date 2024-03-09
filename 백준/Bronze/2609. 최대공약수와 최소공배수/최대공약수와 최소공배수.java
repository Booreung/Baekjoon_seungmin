import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); int num2 = sc.nextInt();
		int max = num1 > num2 ? num1:num2;
		int a=0;
		//최대 공약수
		for(int i = max;i>0;i--) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				a = i;//최대 공약수
				break;
			}
		}
		int b = a * (num1/a)*(num2/a);
		System.out.println(a);
		System.out.println(b);
	}
}