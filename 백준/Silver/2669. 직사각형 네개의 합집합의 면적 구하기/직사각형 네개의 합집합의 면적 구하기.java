import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] arr = new int [101][101];
        for(int i = 0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = y1;j<y2;j++){
                for(int k = x1;k<x2;k++){
                    arr[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}