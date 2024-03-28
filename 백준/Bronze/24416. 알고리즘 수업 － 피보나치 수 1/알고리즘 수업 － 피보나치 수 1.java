import java.util.Scanner;

public class Main {

    static int cnt_a =0;
    static int cnt_b =0;
    static int f[];

    static int fib(int n){
        if(n==1 || n==2) {
            cnt_a++;
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static int fibonacci(int n){
        f[0] = 1;
        f[1] = 1;

        for(int i = 2;i<n;i++){
            f[i] = f[i-1] + f[i-2];
            cnt_b++;
        }
        return f[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        f = new int[num];
        fib(num); 
        fibonacci(num);
        System.out.println(cnt_a+" "+cnt_b);
    }
}