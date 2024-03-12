import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();

        String str = st.nextToken();
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            int num = Integer.parseInt(String.valueOf(c));
            arr.add(num);
        }
        arr.sort(Comparator.reverseOrder());
        for(int i : arr){
            System.out.print(i);
        }
    }
}