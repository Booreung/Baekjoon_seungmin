import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt(); int ans = sc.nextInt();
        int c[] = new int[card];
        for(int i = 0;i<card;i++) {
            c[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0;i<c.length-2;i++){
            for(int j = i+1;j<c.length-1;j++){
                for(int k = j+1;k<c.length;k++){
                    int sum = c[i] + c[j] + c[k];
                    if(ans == sum){
                        result = sum;
                    }
                    if(result < sum && sum <ans){
                        result = sum;
                    }

                }
            }
        }
        System.out.println(result);


    }
}