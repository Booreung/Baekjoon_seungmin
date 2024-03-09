import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kids[] = new int[9];
		int sum = 0;
		boolean check = false;
		for(int i=0;i<kids.length;i++) {
			kids[i] = sc.nextInt();
			sum += kids[i];
		}
		for(int i =0;i<kids.length;i++) {
			if(check) break;
			for(int j=0;j<kids.length;j++) {
				if(i==j) continue;
				if((sum - (kids[i]+kids[j])) == 100) {
					kids[i] = 0;
					kids[j] = 0;
					check = true;
					break;
				}
			}
		}
		Arrays.sort(kids);
		for(int i : kids) {
			if(i!=0) System.out.println(i);
		}

	}
}