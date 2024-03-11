import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++) {
            int pos = sc.nextInt();

            if (pos == 0) arr.add(i + 1);
            else arr.add(arr.size()-pos, i + 1);
        }
        for(int j : arr){
            System.out.print(j+" ");
        }
    }
}