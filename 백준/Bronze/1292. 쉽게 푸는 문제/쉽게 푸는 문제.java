import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int num= 1; int cnt=0;
        for(int i=0;i<1000;i++){
            arr.add(num);
            cnt ++;
            if(cnt == num){
                cnt = 0;
                num ++;
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a-1;i<=b-1;i++){
            sum += arr.get(i);
        }
        System.out.println(sum);
    }
}