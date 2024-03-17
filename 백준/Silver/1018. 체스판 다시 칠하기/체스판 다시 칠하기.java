import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int getMin(int x, int y, String [][]board){
        int cnt = 0;
        String start = "W";

        for(int i=x;i<x+8;i++){
            for(int j =y;j<y+8;j++){
                if(!board[i][j].equals(start)) cnt++;
                if(start.equals("W")){
                    start = "B";
                }
                else{
                    start = "W";
                }
            }
            if(start.equals("W")){
                start = "B";
            }
            else{
                start = "W";
            }
        }
        cnt = Math.min(cnt,64-cnt);
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String [][] board = new String[N][M];

        for(int i = 0;i<N;i++){
            String str = br.readLine();
            for(int j =0;j<M;j++){
                if(str.charAt(j) == 'W'){
                    board[i][j] = "W";
                }
                else{
                    board[i][j] = "B";
                }
            }
        }
        int min = 64;
        for(int i = 0;i<N-7;i++){
            for(int j =0;j<M-7;j++){
                min = Math.min(min,getMin(i,j,board));
            }
        }
        System.out.println(min);

    }
}