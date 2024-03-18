import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String []str = new String [num];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        for(int j=0;j<str.length-1;j++){
            for(int k=j+1;k<str.length;k++){
                if(str[j].length()==str[k].length()){
                    if(str[j].compareTo(str[k])>0){
                        String temp = str[k];
                        str[k] = str[j];
                        str[j] = temp;
                    }
                }
                else{
                    if(str[j].length()>str[k].length()){
                        String temp = str[k];
                        str[k] = str[j];
                        str[j] = temp;
                    }
                }
            }
        }
        for(int l = 0;l<str.length;l++){
            if(l != 0){
                if(str[l].compareTo(str[l-1])!=0)
                    System.out.println(str[l]);
            }
            else{
                System.out.println(str[l]);
            }
        }

    }
}