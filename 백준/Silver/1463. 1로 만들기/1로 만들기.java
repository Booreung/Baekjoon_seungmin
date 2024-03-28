import java.util.Scanner;

public class Main {

    static Integer[] dp;
    static int recur(int n){
        if(dp[n] ==null){
            if(n%6==0){
                dp[n] = Math.min(recur(n-1),Math.min(recur(n/3),recur(n/2))) + 1;
            }
            else if(n%3 == 0){
                dp[n] = Math.min(recur(n/3),recur(n-1)) + 1;
            }
            else if(n%2 == 0){
                dp[n] = Math.min(recur(n/2),recur(n-1)) + 1;
            }
            else {
                dp[n] = recur(n - 1) + 1;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        dp = new Integer[num+1];
        dp[0] = dp[1] = 0;

        System.out.print(recur(num));
    }
}