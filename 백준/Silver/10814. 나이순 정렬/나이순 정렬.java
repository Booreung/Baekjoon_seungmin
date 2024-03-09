import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
    int n;
    String name;
    Person(int n, String name){
        this.n = n;
        this.name = name;
    }
    @Override
    public String toString(){
        return n+" "+name;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Person [] p = new Person[num];
        for(int i = 0 ;i<p.length;i++){
            p[i] = new Person(sc.nextInt(), sc.next());
        }
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.n - o2.n;
            }
        });

        for(Person pp : p){
            System.out.println(pp);
        }
    }
}