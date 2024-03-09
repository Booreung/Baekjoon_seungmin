import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i = 2;i<n;i++){
            if(n%i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        for(int i = N;i<=M;i++){
            if(isPrime(i)){
                sum += i;
                arr.add(i);
            }
        }

        if(sum == 0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(arr.get(0));
        }
    }
}